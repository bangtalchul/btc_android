package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.repository.ThemeRepository
import com.bnk.bangtalchul.view.adapter.ThemeAdapter
import com.bnk.bangtalchul.viewmodel.StoreViewModel
import com.bnk.bangtalchul.viewmodel.ThemeViewModel

class StoreActivity : AppCompatActivity() {

    private lateinit var themeViewModel: ThemeViewModel
    private lateinit var storeViewModel: StoreViewModel

    private lateinit var recyclerAdapter: ThemeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        storeViewModel = StoreViewModel()
        themeViewModel = ThemeViewModel()

        val storeId = intent.getStringExtra("store_id")?.toInt()?: 0
        var storeInfo = storeViewModel.getStoreInfo(storeId)

        val title = findViewById<TextView>(R.id.title_textview)
        val address = findViewById<TextView>(R.id.storeAddress)
        val desc = findViewById<TextView>(R.id.storeDesc)
        val backButton = findViewById<ImageButton>(R.id.backbutton)

        backButton.setOnClickListener {
            finish()
        }

        title.text = storeInfo.name
        address.text = storeInfo.address
        desc.text = storeInfo.desc

        val recyclerView: ViewPager2 = findViewById(R.id.image_viewpager)

        /* 여백, 너비에 대한 정의 */
        val pageMarginPx = resources.getDimensionPixelOffset(R.dimen.page_margin)
        val pagerWidth = resources.getDimensionPixelOffset(R.dimen.page_width)
        val screenWidth = resources.displayMetrics.widthPixels
        val offsetPx = screenWidth - pageMarginPx - pagerWidth

        recyclerView.setPageTransformer { page, position ->
            page.translationX = position * -offsetPx
        }

        recyclerView.offscreenPageLimit = 1

        recyclerAdapter = ThemeAdapter(this)

        recyclerAdapter.setList(themeViewModel.getThemeList(storeId))

        recyclerView.adapter = recyclerAdapter
    }
}
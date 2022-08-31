package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.BoardEntity
import com.bnk.bangtalchul.model.repository.CommentRepository
import com.bnk.bangtalchul.model.repository.ThemeRepository
import com.bnk.bangtalchul.view.adapter.BoardAdapter
import com.bnk.bangtalchul.view.adapter.CommentAdapter
import com.bnk.bangtalchul.view.adapter.ThemeAdapter
import com.bnk.bangtalchul.viewmodel.BoardViewModel
import com.bnk.bangtalchul.viewmodel.StoreViewModel
import com.bnk.bangtalchul.viewmodel.ThemeViewModel

class StoreActivity : AppCompatActivity() {

    private lateinit var themeViewModel: ThemeViewModel
    private lateinit var storeViewModel: StoreViewModel
    private val themeRepository = ThemeRepository()

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
        val desc = findViewById<TextView>(R.id.storeDesc);

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

        recyclerAdapter.setList(themeRepository.getThemeList(storeId))

        recyclerView.adapter = recyclerAdapter
    }
}
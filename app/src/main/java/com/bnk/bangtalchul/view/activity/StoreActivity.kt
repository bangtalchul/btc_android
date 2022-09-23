package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RatingBar
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.repository.ThemeRepository
import com.bnk.bangtalchul.view.adapter.ThemeAdapter
import com.bnk.bangtalchul.viewmodel.StoreViewModel
import com.bnk.bangtalchul.viewmodel.ThemeViewModel
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class StoreActivity : AppCompatActivity() {

    private lateinit var themeViewModel: ThemeViewModel
    private lateinit var storeViewModel: StoreViewModel

    private lateinit var recyclerAdapter: ThemeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        storeViewModel = StoreViewModel()
        themeViewModel = ThemeViewModel()

        val storeId = intent.getIntExtra("store_id", 0)
        var storeInfo = storeViewModel.getStoreInfo(storeId)

        //별점 세팅
        val rating = findViewById<RatingBar>(R.id.store_rating)
        var ratingText = findViewById<TextView>(R.id.store_rating_text)
        rating.rating = storeInfo.rating
        ratingText.text= storeInfo.rating.toString()

        // 상세정보 세팅
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
        /*
        val pageMarginPx = resources.getDimensionPixelOffset(R.dimen.page_margin)
        val pagerWidth = resources.getDimensionPixelOffset(R.dimen.page_width)
        val screenWidth = resources.displayMetrics.widthPixels
        val offsetPx = screenWidth - pageMarginPx - pagerWidth

        recyclerView.setPageTransformer { page, position ->
            page.translationX = position * -offsetPx
        }
        */

        recyclerView.offscreenPageLimit = 1

        recyclerAdapter = ThemeAdapter(this)

        recyclerAdapter.setList(themeViewModel.getThemeList(storeId))

        recyclerView.adapter = recyclerAdapter

        val wormDotsIndicator = findViewById<WormDotsIndicator>(R.id.worm_dots_indicator)
        wormDotsIndicator.attachTo(recyclerView)
    }
}
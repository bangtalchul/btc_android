package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.ThemeEntity
import com.bnk.bangtalchul.model.repository.ThemeRepository
import com.bnk.bangtalchul.view.adapter.ThemeAdapter
import com.bnk.bangtalchul.viewmodel.StoreViewModel
import com.bnk.bangtalchul.viewmodel.ThemeViewModel

class ThemeActivity : AppCompatActivity() {

    private lateinit var themeViewModel: ThemeViewModel
    private val themeRepository = ThemeRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme)

        themeViewModel = ThemeViewModel()

        // val themeId = intent.getStringExtra("theme_id")?.toInt()?: 0
        //var themeInfo = themeViewModel.getThemeInfo(themeId)

        /*al title = findViewById<TextView>(R.id.title_textview)
        val desc = findViewById<TextView>(R.id.storeDesc)*/
        val backButton = findViewById<ImageButton>(R.id.backbutton)

        backButton.setOnClickListener {
            finish()
        }
    }
}
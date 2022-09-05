package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.viewmodel.ThemeViewModel

class ReserveActivity : AppCompatActivity() {

    private lateinit var themeViewModel: ThemeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserve)

        themeViewModel = ThemeViewModel()

        val themeId = intent.getStringExtra("theme_id")?.toInt()?: 0
        var themeInfo = themeViewModel.getReserveList(themeId)
    }
}
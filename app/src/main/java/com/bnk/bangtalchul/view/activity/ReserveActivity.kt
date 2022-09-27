package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.view.adapter.AdapterMonth
import com.bnk.bangtalchul.viewmodel.ThemeViewModel

class ReserveActivity : AppCompatActivity() {

    private lateinit var themeViewModel: ThemeViewModel

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_reserve)
//
//        themeViewModel = ThemeViewModel()
//
//        val themeId = intent.getStringExtra("theme_id")?.toInt()?: 0
//        var themeInfo = themeViewModel.getReserveList(themeId)
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserve)

        val monthListManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val monthListAdapter = AdapterMonth()

        val calendar_custom = findViewById<RecyclerView>(R.id.calendar_custom)
        calendar_custom.apply {
            layoutManager = monthListManager
            adapter = monthListAdapter
            scrollToPosition(Int.MAX_VALUE/2)
        }
        val snap = PagerSnapHelper()
        snap.attachToRecyclerView(calendar_custom)
    }
}
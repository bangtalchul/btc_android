package com.bnk.bangtalchul.view.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.widget.AppCompatRadioButton
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

        // time view
        val buttons = 5
        val rb = arrayOfNulls<AppCompatRadioButton>(buttons)
        val rgp = findViewById<View>(R.id.radio_group) as RadioGroup
        rgp.orientation = LinearLayout.HORIZONTAL
        for (i in 1..buttons) {
            val rbn = RadioButton(this)
            rbn.id = View.generateViewId()
            rbn.text = "0$i : 00"
            val params =
                LinearLayout.LayoutParams(RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT, 1f)
            params.setMargins(15, 0, 15, 0)
            rbn.layoutParams = params
            rbn.setPadding(40,30,40,30)
            rbn.setBackgroundResource(R.drawable.selector_radio_button)
            rbn.setTextColor(Color.BLACK)
            rbn.setTextSize(1, 18f)
            rbn.setButtonDrawable(0)
            rgp.addView(rbn)
        }
    }
}
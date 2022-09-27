package com.bnk.bangtalchul.view.activity

import com.bnk.bangtalchul.R
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatRadioButton


class RadioButtonTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button_test)

        //Defining 5 buttons.
        val buttons = 10
        val rb = arrayOfNulls<AppCompatRadioButton>(buttons)
        val rgp = findViewById<View>(R.id.radio_group) as RadioGroup
        rgp.orientation = LinearLayout.HORIZONTAL
        for (i in 1..buttons) {
            val rbn = RadioButton(this)
            rbn.id = View.generateViewId()
            rbn.text = "RadioButton$i"
            val params =
                LinearLayout.LayoutParams(RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.WRAP_CONTENT, 1f)
            rbn.layoutParams = params
            rgp.addView(rbn)
        }
    }
}
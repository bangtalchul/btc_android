package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bnk.bangtalchul.R

class StoreActivity : AppCompatActivity() {
    lateinit var storeId : String
    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        storeId = intent.getStringExtra("store_id") as String

    }
}
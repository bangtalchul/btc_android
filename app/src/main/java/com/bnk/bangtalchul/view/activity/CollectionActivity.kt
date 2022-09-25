package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.UserInfoEntity
import com.bnk.bangtalchul.viewmodel.MyPageViewModel


class CollectionActivity : AppCompatActivity() {

    private lateinit var viewModel: MyPageViewModel
    private lateinit var userInfo: UserInfoEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collection)

        viewModel = MyPageViewModel() //viewModel 초기화

        // info setting
        val countText = findViewById<TextView>(R.id.count)
        val levelText = findViewById<TextView>(R.id.level)
        val levelImg = findViewById<ImageView>(R.id.growth)
        userInfo = viewModel.getUser()
        var count = userInfo.count
        countText.text = "총 " + count + "번 참여 하셨군요!!"
        when{
            count < 10 -> {
                levelText.text = "공포 테마 방린이 입니다!!"
                levelImg.setImageResource(R.drawable.level1_sprout)
            }
            count < 50 -> {
                levelText.text = "공포 테마 마니아 입니다!!"
                levelImg.setImageResource(R.drawable.level2_tree)
            }
            else -> {
                levelText.text = "공포 테마 마스터 입니다!!"
                levelImg.setImageResource(R.drawable.level3_tree)
            }
        }
        //back button
        val backButton = findViewById<ImageButton>(R.id.collection_backbutton)
        backButton.setOnClickListener {
            finish()
        }
    }
}
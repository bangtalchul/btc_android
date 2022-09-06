package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.repository.UserInfoRepository


class MyPageEditActivity : AppCompatActivity() {

    val userInfoRepo = UserInfoRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page_edit)

        val profileImg = findViewById<TextView>(R.id.edit_img)
        val backButton = findViewById<ImageButton>(R.id.mypage_edit_backbutton)
        val nickName = findViewById<EditText>(R.id.mypage_edit_nickname_edit)
        val saveButton = findViewById<TextView>(R.id.mypage_edit_save_button)

        backButton.setOnClickListener {
            finish()
        }

        profileImg.setOnClickListener{

        }

        saveButton.setOnClickListener {
            if(nickName.text.toString() != "")
                userInfoRepo.updateUser(nickName.text.toString())
            finish()
        }
    }
}
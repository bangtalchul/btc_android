package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.UserInfoEntity
import com.bnk.bangtalchul.util.Event

//https://developer.android.com/topic/libraries/data-binding/expressions
class UserInfoRepository {
    var user = UserInfoEntity(0, "박상혁", "상상쓰", 100)

    fun updateUser(nickName: String) {
        user.nickname = nickName
    }
}
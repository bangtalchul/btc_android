package com.bnk.bangtalchul.viewmodel

import androidx.lifecycle.ViewModel
import com.bnk.bangtalchul.model.entity.UserInfoEntity
import com.bnk.bangtalchul.model.repository.UserInfoRepository


class MyPageViewModel : ViewModel() {
    private val userRepository = UserInfoRepository()

    private val user = userRepository.user

    fun getUser(): UserInfoEntity {
        return this.user
    }

    fun goWrittenPage() {

    }

    /*
    private var count = 0
    private val buttonText = ObservableField<String>()

    fun getButtonText(): ObservableField<String>? {
        return buttonText
    }

    fun updateButtonText() {
        buttonText.set("$count clicked")
    }

    fun onButtonClick() {
        ++count
        updateButtonText()
    }*/
}
//https://apt-info.github.io/%EA%B0%9C%EB%B0%9C/android-data-binding-button/
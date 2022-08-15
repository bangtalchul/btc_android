package com.bnk.bangtalchul.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bnk.bangtalchul.model.entity.UserInfoEntity
import com.bnk.bangtalchul.model.repository.UserInfoRepository
import com.bnk.bangtalchul.util.Event


class MyPageViewModel : ViewModel() {
    private val userRepository = UserInfoRepository()

    //for test
    private val user = userRepository.user

    fun getUser(): UserInfoEntity {
        return this.user
    }

    //for page event
    private val _openEvent = MutableLiveData<Event<Int>>()
    val openEvent: LiveData<Event<Int>> get() = _openEvent

    fun goPage(type: Int) {
        _openEvent.value = Event(type)
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
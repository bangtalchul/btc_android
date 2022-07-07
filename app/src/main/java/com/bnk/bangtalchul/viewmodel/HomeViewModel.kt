package com.bnk.bangtalchul.viewmodel

import androidx.lifecycle.ViewModel
import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.repository.HomeRepository

class HomeViewModel : ViewModel() {

    private val homeRepository = HomeRepository()

    private val cafeList = homeRepository.getList()

    fun getList(): ArrayList<HomeEntity> {
        return this.cafeList
    }
}

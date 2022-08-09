package com.bnk.bangtalchul.viewmodel

import androidx.lifecycle.ViewModel
import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.repository.HomeRepository

class HomeViewModel : ViewModel() {

    private val homeRepository = HomeRepository()

    private val cafeList = homeRepository.getList()
    private val themeList = homeRepository.getList2()

    fun getList(): ArrayList<HomeEntity> {
        return this.cafeList
    }
    fun getList2(): ArrayList<HomeEntity> {
        return this.themeList
    }
    fun getRegionList(region :String): ArrayList<HomeEntity> {
        return homeRepository.getRegionList(region)
    }
}

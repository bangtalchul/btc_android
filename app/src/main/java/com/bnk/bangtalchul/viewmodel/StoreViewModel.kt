package com.bnk.bangtalchul.viewmodel

import androidx.lifecycle.ViewModel
import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.entity.StoreEntity
import com.bnk.bangtalchul.model.repository.StoreRepository

class StoreViewModel : ViewModel() {

    private val storeRepository = StoreRepository()
    private val homeStoreList = storeRepository.getHomeStoreList()

    fun getHomeStoreList(): ArrayList<HomeEntity> {
        return this.homeStoreList
    }

    fun getHomeRegionList(region :String): ArrayList<HomeEntity> {
        return storeRepository.getHomeRegionList(region)
    }

    fun getStoreList(string :String): ArrayList<StoreEntity> {
        return this.storeRepository.getStoreList(string)
    }
}

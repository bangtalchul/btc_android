package com.bnk.bangtalchul.viewmodel

import androidx.lifecycle.ViewModel
import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.entity.StoreEntity
import com.bnk.bangtalchul.model.repository.StoreRepository

class StoreViewModel : ViewModel() {

    private val storeRepository = StoreRepository()
    private val homeStoreList = storeRepository.getHomeStoreList()
    private val storeList = storeRepository.getStoreList()

    fun getHomeStoreList(): ArrayList<HomeEntity> {
        return this.homeStoreList
    }

    fun getHomeRegionList(region :String): ArrayList<HomeEntity> {
        return storeRepository.getHomeRegionList(region)
    }

    fun getStoreList(): ArrayList<StoreEntity> {
        return this.storeList
    }
}

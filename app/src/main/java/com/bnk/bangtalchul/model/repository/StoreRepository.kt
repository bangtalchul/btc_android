package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.entity.StoreEntity

class StoreRepository {

    private val homeStoreList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(5, "서울이스케이프룸", "부산광역시 부사진구", "store9", 0)
        , HomeEntity(1, "4421탈출성공", "부산광역시 부산진구", "store1", 0)
        , HomeEntity(2, "INVESTIGATION", "부산광역시 동구", "store2", 0)
        , HomeEntity(3, "비트포비아 서면점", "부산광역시 부산진구", "store3", 0)
        , HomeEntity(4, "마스터키", "부산광역시 부산진구", "store4", 0)
    )

    private val homeRegionList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "THE CODE 이스케이프 룸", "부산광역시 남구", "store6", 0)
        , HomeEntity(2, "룸익스케이프", "부산광역시 중구", "store7", 0)
        , HomeEntity(3, "비트포비아 서면점", "부산광역시 부산진구", "store3", 0)
        , HomeEntity(4, "마스터키", "부산광역시 부산진구", "store4", 0)
        , HomeEntity(5, "이스케이프", "부산광역시 해운대구", "store5", 0)
    )

    private val storeList :ArrayList<StoreEntity> = arrayListOf(
        StoreEntity(1, "4421탈출성공", "부산광역시 부산진구", "", "", "", "", 0, "", "store1", 5f)
        , StoreEntity(2, "INVESTIGATION", "부산광역시 동구", "", "", "", "", 0, "", "store2", 4f)
        , StoreEntity(3, "비트포비아 서면점", "부산광역시 부산진구", "", "", "", "", 0, "", "store3", 4f)
        , StoreEntity(4, "마스터키", "부산광역시 부산진구", "", "", "", "", 0, "", "store4", 5f)
        , StoreEntity(5, "이스케이프", "부산광역시 해운대구", "", "", "", "", 0, "", "store5", 2f)
        , StoreEntity(6, "THE CODE 이스케이프 룸", "부산광역시 남구", "", "", "", "", 0, "", "store6", 3f)
        , StoreEntity(7, "룸익스케이프", "부산광역시 중구", "", "", "", "", 0, "", "store7", 1f)
    )

    private val storeInfo :StoreEntity = StoreEntity(1, "부산이스케이프룸", "부산광역시 부산진구 183-1 쥬디스태화 신관 3층", "", "", "안녕하세요! 이스케이프서면점입니다. 오늘 하루도 최고의 서비스로 모시겠습니다!", "", 0, "", "store1", 5f)

    fun getHomeStoreList(): ArrayList<HomeEntity> {
        return homeStoreList
    }

    fun getHomeRegionList(region: String): ArrayList<HomeEntity> {
        return homeRegionList
    }

    fun getStoreList(string: String): ArrayList<StoreEntity> {
        return storeList
    }

    fun getStoreInfo(storeId: Int): StoreEntity {
        return storeInfo
    }
}
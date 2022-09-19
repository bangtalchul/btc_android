package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.entity.StoreEntity

class StoreRepository {

    private val homeStoreList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "4421탈출성공", "부산광역시 부산진구", "store1", 0)
        , HomeEntity(2, "INVESTIGATION", "부산광역시 동구", "store2", 0)
        , HomeEntity(3, "비트포비아 서면점", "부산광역시 부산진구", "store3", 0)
        , HomeEntity(4, "마스터키", "부산광역시 부산진구", "store4", 0)
        , HomeEntity(5, "이스케이프", "부산광역시 해운대구", "store5", 0)
    )

    private val homeRegionList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "THE CODE 이스케이프 룸", "부산광역시 남구", "store6", 0)
        , HomeEntity(2, "룸익스케이프", "부산광역시 중구", "store7", 0)
        , HomeEntity(3, "비트포비아 서면점", "부산광역시 부산진구", "store3", 0)
        , HomeEntity(4, "마스터키", "부산광역시 부산진구", "store4", 0)
        , HomeEntity(5, "이스케이프", "부산광역시 해운대구", "store5", 0)
    )

    private val storeList :ArrayList<StoreEntity> = arrayListOf(
        StoreEntity(1, "4421탈출성공", "부산광역시 부산진구", "", "", "", "", 0, "", "store1")
        , StoreEntity(2, "INVESTIGATION", "부산광역시 동구", "", "", "", "", 0, "", "store2")
        , StoreEntity(3, "비트포비아 서면점", "부산광역시 부산진구", "", "", "", "", 0, "", "store3")
        , StoreEntity(4, "마스터키", "부산광역시 부산진구", "", "", "", "", 0, "", "store4")
        , StoreEntity(5, "이스케이프", "부산광역시 해운대구", "", "", "", "", 0, "", "store5")
        , StoreEntity(6, "THE CODE 이스케이프 룸", "부산광역시 남구", "", "", "", "", 0, "", "store6")
        , StoreEntity(7, "룸익스케이프", "부산광역시 중구", "", "", "", "", 0, "", "store7")
    )

    private val storeInfo :StoreEntity = StoreEntity(1, "비밀의 화원 서면점", "부산광역시 자성로 8번길 12", "", "", "비밀의 화원 서면점입니다. 영업시간은 ~~ㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎ", "", 0, "", "store1")

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
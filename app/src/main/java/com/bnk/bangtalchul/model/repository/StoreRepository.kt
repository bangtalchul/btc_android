package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.entity.StoreEntity

class StoreRepository {

    private val homeStoreList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "비트포비아1", "부산광역시", "store1")
        , HomeEntity(2, "비트포비아2", "부산광역시", "store1")
        , HomeEntity(3, "비트포비아3", "부산광역시", "store1")
        , HomeEntity(4, "비트포비아4", "부산광역시", "store1")
        , HomeEntity(5, "비트포비아5", "부산광역시", "store1")
    )

    private val homeRegionList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "비트포비아1", "부산광역시", "store1")
        , HomeEntity(2, "비트포비아2", "부산광역시", "store1")
        , HomeEntity(3, "비트포비아3", "부산광역시", "store1")
        , HomeEntity(4, "비트포비아4", "부산광역시", "store1")
        , HomeEntity(5, "비트포비아5", "부산광역시", "store1")
    )

    private val storeList :ArrayList<StoreEntity> = arrayListOf(
        StoreEntity(1, "비밀의 화원 서면점", "부산광역시", "", "", "", "", 0, "", "store1")
        , StoreEntity(2, "코드케이 서면점", "부산광역시", "", "", "", "", 0, "", "store2")
        , StoreEntity(3, "마스터키 서면점", "부산광역시", "", "", "", "", 0, "", "store2")
        , StoreEntity(4, "비트포비아 서면점", "부산광역시", "", "", "", "", 0, "", "store2")
        , StoreEntity(5, "비트포비아 문현점", "부산광역시", "", "", "", "", 0, "", "store2")
        , StoreEntity(6, "꿈의 정원 수정점", "부산광역시", "", "", "", "", 0, "", "store2")
    )

    private val storeInfo :StoreEntity = StoreEntity(1, "비밀의 화원 서면점", "부산광역시 자성로 8번길 12", "", "", "비밀의 화원 서면점입니다. 영업시간은 ~~", "", 0, "", "store1")

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
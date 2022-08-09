package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.HomeEntity

class HomeRepository {
    var cafe = HomeEntity(0, "", "", "")

    private val cafeList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "비트포비아1", "부산광역시", "store1"),
        HomeEntity(2, "비트포비아2", "부산광역시", "store2"),
        HomeEntity(3, "비트포비아3", "부산광역시", "store3"),
        HomeEntity(4, "비트포비아4", "부산광역시", "store4"),
        HomeEntity(5, "비트포비아5", "부산광역시", "store5")
    )

    private val themeList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "비트포비아6", "부산광역시", "store1"),
        HomeEntity(2, "비트포비아7", "부산광역시", "store2"),
        HomeEntity(3, "비트포비아8", "부산광역시", "store3"),
        HomeEntity(4, "비트포비아9", "부산광역시", "store4"),
        HomeEntity(5, "비트포비아10", "부산광역시", "store5")
    )

    private val regionList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "비트포비아11", "부산광역시", "store1"),
        HomeEntity(2, "비트포비아12", "부산광역시", "store2"),
        HomeEntity(3, "비트포비아13", "부산광역시", "store3"),
        HomeEntity(4, "비트포비아14", "부산광역시", "store4"),
        HomeEntity(5, "비트포비아15", "부산광역시", "store5")
    )

    fun getList(): ArrayList<HomeEntity> {
        return cafeList
    }

    fun getList2(): ArrayList<HomeEntity> {
        return themeList
    }

    fun getRegionList(region :String): ArrayList<HomeEntity> {
        return regionList
    }
}
package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.entity.ThemeEntity

class ThemeRepository {

    private val homeThemeList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "비트포비아1", "부산광역시", "store1")
        , HomeEntity(2, "비트포비아2", "부산광역시", "store1")
        , HomeEntity(3, "비트포비아3", "부산광역시", "store1")
        , HomeEntity(4, "비트포비아4", "부산광역시", "store1")
        , HomeEntity(5, "비트포비아5", "부산광역시", "store1")
    )

    fun getHomeThemeList(): ArrayList<HomeEntity> {
        return homeThemeList
    }
}
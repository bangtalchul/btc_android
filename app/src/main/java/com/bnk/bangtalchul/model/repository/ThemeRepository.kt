package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.entity.ThemeEntity

class ThemeRepository {

    private val homeThemeList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "테마1", "부산광역시", "store1")
        , HomeEntity(2, "테마2", "부산광역시", "store1")
        , HomeEntity(3, "테마3", "부산광역시", "store1")
        , HomeEntity(4, "테마4", "부산광역시", "store1")
        , HomeEntity(5, "테마5", "부산광역시", "store1")
    )

    private val themeList :ArrayList<ThemeEntity> = arrayListOf(
        ThemeEntity(1, "테마1", "", "", "", "", 0, 0, "store2", 0)
        , ThemeEntity(2, "테마2", "", "", "", "", 0, 0, "store2", 0)
        , ThemeEntity(3, "테마3", "", "", "", "", 0, 0, "store2", 0)
        , ThemeEntity(4, "테마4", "", "", "", "", 0, 0, "store2", 0)
        , ThemeEntity(5, "테마5", "", "", "", "", 0, 0, "store2", 0)
    )

    fun getHomeThemeList(): ArrayList<HomeEntity> {
        return homeThemeList
    }

    fun getThemeList(storeId: Int): ArrayList<ThemeEntity> {
        return themeList
    }
}
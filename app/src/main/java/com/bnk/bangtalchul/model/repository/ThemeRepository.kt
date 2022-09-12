package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.entity.ReserveEntity
import com.bnk.bangtalchul.model.entity.StoreEntity
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

    private val reserveList :ArrayList<ReserveEntity> = arrayListOf(
        ReserveEntity(1, "책 읽어주는 남자", "20220908", "0", "0900", "1000", 0, 0)
        , ReserveEntity(1, "책 읽어주는 남자", "20220908", "0", "1100", "1200", 0, 0)
        , ReserveEntity(1, "책 읽어주는 남자", "20220909", "0", "0900", "1000", 0, 0)
        , ReserveEntity(1, "책 읽어주는 남자", "20220910", "0", "0900", "1000", 0, 0)
    )

    private val themeInfo : ThemeEntity = ThemeEntity(1, "책 읽어주는 남자", "30", "1", "테마소개입니다", "3", 1, 0, "store1", 6)

    fun getHomeThemeList(): ArrayList<HomeEntity> {
        return homeThemeList
    }

    fun getThemeList(storeId: Int): ArrayList<ThemeEntity> {
        return themeList
    }

    fun getThemeInfo(themeId: Int): ThemeEntity {
        return themeInfo
    }

    fun getReserveList(themeId: Int): ArrayList<ReserveEntity> {
        return reserveList
    }
}
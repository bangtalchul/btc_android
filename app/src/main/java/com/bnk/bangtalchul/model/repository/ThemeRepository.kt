package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.entity.ReserveEntity
import com.bnk.bangtalchul.model.entity.StoreEntity
import com.bnk.bangtalchul.model.entity.ThemeEntity

class ThemeRepository {

    private val homeThemeList :ArrayList<HomeEntity> = arrayListOf(
        HomeEntity(1, "저주받은 집", "부산광역시", "theme1", 3)
        , HomeEntity(2, "괴도루키", "부산광역시", "theme2", 3)
        , HomeEntity(3, "반고흐의 방", "부산광역시", "theme3", 5)
        , HomeEntity(4, "스토커", "부산광역시", "theme4", 2)
        , HomeEntity(5, "웨딩크루즈 살인사건", "부산광역시", "theme5", 4)
    )

    private val themeList :ArrayList<ThemeEntity> = arrayListOf(
        ThemeEntity(1, "주차장", "", "", "", "", 0, 0, "theme10", 0, 4f)
        , ThemeEntity(2, "엘리베이터", "", "", "", "", 0, 0, "theme11", 0, 4.5f)
        , ThemeEntity(3, "고문실", "", "", "", "", 0, 0, "theme12", 0, 3.5f)
        , ThemeEntity(4, "공장", "", "", "", "", 0, 0, "theme13", 0, 4.0f)
        , ThemeEntity(5, "타짜", "", "", "", "", 0, 0, "theme14", 0, 3.5f)
    )

    private val reserveList :ArrayList<ReserveEntity> = arrayListOf(
        ReserveEntity(2, "괴도루키", "20220908", "0", "0900", "1000", 0, 0)
        , ReserveEntity(2, "괴도루키", "20220908", "0", "1100", "1200", 0, 0)
        , ReserveEntity(2, "괴도루키", "20220909", "0", "0900", "1000", 0, 0)
        , ReserveEntity(2, "괴도루키", "20220910", "0", "0900", "1000", 0, 0)
    )

    private val themeInfo : ThemeEntity = ThemeEntity(2, "주차장", "60", "1", "테마소개입니다", "3", 1, 0, "theme10", 6, 4f)

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
package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.SearchEntity

class SearchRepository {
    var cafe = SearchEntity(0, "", "", "")

    private val cafeList :ArrayList<SearchEntity> = arrayListOf(
        SearchEntity(1, "비밀의 화원 서면점", "부산광역시", "store1"),
        SearchEntity(2, "코드케이 서면점", "부산광역시", "store2"),
        SearchEntity(3, "마스터키 서면점", "부산광역시", "store3"),
        SearchEntity(4, "비트포비아 서면점", "부산광역시", "store4"),
        SearchEntity(5, "비트포비아 문현점", "부산광역시", "store5")
    )

    fun getList(): ArrayList<SearchEntity> {
        return cafeList
    }
}
package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.SearchEntity

class SearchRepository {
    var cafe = SearchEntity(0, "", "", "")

    private val cafeList :ArrayList<SearchEntity> = arrayListOf(
        SearchEntity(1, "비트포비아1", "부산광역시", "store1"),
        SearchEntity(2, "비트포비아2", "부산광역시", "store2"),
        SearchEntity(3, "비트포비아3", "부산광역시", "store3"),
        SearchEntity(4, "비트포비아4", "부산광역시", "store4"),
        SearchEntity(5, "비트포비아5", "부산광역시", "store5")
    )

    fun getList(): ArrayList<SearchEntity> {
        return cafeList
    }
}
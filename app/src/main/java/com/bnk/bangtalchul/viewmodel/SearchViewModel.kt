package com.bnk.bangtalchul.viewmodel

import androidx.lifecycle.ViewModel
import com.bnk.bangtalchul.model.entity.SearchEntity
import com.bnk.bangtalchul.model.repository.SearchRepository

class SearchViewModel : ViewModel() {
    private val searchRepository = SearchRepository()

    private val cafeList = searchRepository.getList()

    fun getList(): ArrayList<SearchEntity> {
        return this.cafeList
    }
}
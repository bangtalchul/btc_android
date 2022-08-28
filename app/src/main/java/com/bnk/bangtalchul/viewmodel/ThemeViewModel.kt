package com.bnk.bangtalchul.viewmodel

import androidx.lifecycle.ViewModel
import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.model.repository.ThemeRepository

class ThemeViewModel : ViewModel() {

    private val themeRepository = ThemeRepository()
    private val homeThemeList = themeRepository.getHomeThemeList()

    fun getHomeThemeList(): ArrayList<HomeEntity> {
        return this.homeThemeList
    }
}

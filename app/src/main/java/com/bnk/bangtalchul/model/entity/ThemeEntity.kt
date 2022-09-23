package com.bnk.bangtalchul.model.entity

data class ThemeEntity (
    var themeId: Int,
    var name: String,
    var time: String,
    var status: String,
    var desc: String,
    var level: String,
    var storeId: Int,
    var codeId: Int,
    var photoUrl: String,
    var limit: Int,
    var rating: Float
) {
    constructor() : this(0, "", "", "", "", "", 0, 0, "", 0, 0f) {
        this.storeId = storeId
        this.name = name
        this.time = time
        this.status = status
        this.desc = desc
        this.level = level
        this.storeId = storeId
        this.codeId = codeId
        this.photoUrl = photoUrl
        this.limit = limit
        this.rating = rating
    }
}
package com.bnk.bangtalchul.model.entity

data class HomeEntity (
    var id: Int,
    var name: String,
    var address: String,
    var photoUrl: String,
    var score: Int
) {
    constructor() : this(0, "", "", "", 0) {
        this.id = id
        this.name = name
        this.address = address
        this.photoUrl = photoUrl
        this.score = score
    }
}
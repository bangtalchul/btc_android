package com.bnk.bangtalchul.model.entity

data class UserInfoEntity (
    var userId: Int,
    var name: String,
    var nickname: String,
    var count: Int
) {
    constructor() : this(0, "", "", 0) {
        this.userId = userId
        this.name = name
        this.nickname = nickname
        this.count = count
    }
}
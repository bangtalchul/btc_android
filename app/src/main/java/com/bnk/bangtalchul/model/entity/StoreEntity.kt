package com.bnk.bangtalchul.model.entity

data class StoreEntity (
    var storeId: Int,
    var name: String,
    var address: String,
    var phoneNumber: String,
    var status: String,
    var desc: String,
    var createTime: String,
    var userId: Int,
    var editTime: String,
    var photoUrl: String,
    var rating: Float
) {
    constructor() : this(0, "", "", "", "", "", "", 0, "", "", 0f) {
        this.storeId = storeId
        this.name = name
        this.address = address
        this.phoneNumber = phoneNumber
        this.status = status
        this.desc = desc
        this.createTime = createTime
        this.userId = userId
        this.editTime = editTime
        this.photoUrl = photoUrl
        this.rating = rating
    }
}
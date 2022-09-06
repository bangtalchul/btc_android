package com.bnk.bangtalchul.model.entity

data class ReserveEntity (
    var themeId: Int,
    var name: String,
    var reserveDate: String,
    var status: String,
    var startTime: String,
    var endTime: String,
    var storeId: Int,
    var limit: Int
) {
    constructor() : this(0, "", "","","","",0, 0) {
        this.storeId = storeId
        this.name = name
        this.reserveDate = reserveDate
        this.status = status
        this.startTime = startTime
        this.endTime = endTime
        this.storeId = storeId
        this.limit = limit
    }
}
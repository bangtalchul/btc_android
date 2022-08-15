package com.bnk.bangtalchul.model.entity

import java.sql.Timestamp

data class BoardEntity (
    var boardId: Int,
    var title: String,
    var content: String,
    var commentNum: Int,
    var timestamp: String,
    var writerId: Int
) {
    constructor() : this(0, "", "", 0, "", 0) {
        this.boardId = boardId
        this.title = title
        this.content = content
        this.commentNum = commentNum
        this.timestamp = timestamp
        this.writerId = writerId
    }
}
package com.bnk.bangtalchul.model.entity

import java.sql.Timestamp
import java.io.Serializable

data class BoardEntity (
    var boardId: Int,
    var title: String,
    var content: String,
    var commentNum: Int,
    var timestamp: String,
    var writerId: Int
) : Serializable
{
    constructor() : this(0, "", "", 0, "", 0) {
        this.boardId = boardId
        this.title = title
        this.content = content
        this.commentNum = commentNum
        this.timestamp = timestamp
        this.writerId = writerId
    }
}
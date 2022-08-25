package com.bnk.bangtalchul.model.entity

data class CommentEntity(
    var commentId : Int,
    var boardId : Int,
    var content: String,
    var writerId : Int,
    var writerName : String,
    var timestamp: String
) {
    constructor() : this(0, 0, "", 0,"", "") {
        this.commentId = commentId
        this.boardId = boardId
        this.content = content
        this.writerId = writerId
        this.writerName = writerName
        this.timestamp = timestamp
    }
}

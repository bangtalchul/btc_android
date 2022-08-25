package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.BoardEntity
import com.bnk.bangtalchul.model.entity.CommentEntity

class CommentRepository {
    var comment = CommentEntity(0, 0, "", 0,"", "")

    private val commentList :ArrayList<CommentEntity> = arrayListOf(
        CommentEntity(1, 2, "힝", 0, "박상혁", "20220815"),
        CommentEntity(2, 2, "구", 0, "박상혁", "20220715"),
        CommentEntity(3, 2, "힝", 1, "손수현", "20220615"),
        CommentEntity(4, 2, "구", 1, "손수현", "20220515"),
        CommentEntity(4, 2, "구", 1, "손수현", "20220515"),
        )

    fun getCommentList(boardId : Int): ArrayList<CommentEntity> {
        return commentList
    }
}
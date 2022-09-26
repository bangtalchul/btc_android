package com.bnk.bangtalchul.model.repository

import com.bnk.bangtalchul.model.entity.BoardEntity
import com.bnk.bangtalchul.model.entity.CommentEntity

class CommentRepository {
    var comment = CommentEntity(0, 0, "", 0,"", "")

    private val commentList :ArrayList<CommentEntity> = arrayListOf(
        CommentEntity(1, 2, "저 조인할래요!", 0, "상상쓰", "20220815"),
        CommentEntity(2, 2, "이번에 테마 하나나왔던데 그거 하시나용? ><", 3, "강서쌍칼", "20220715"),
        CommentEntity(3, 2, "저요~~ 저 갈래요~~~", 1, "정궁예", "20220615"),
        CommentEntity(4, 2, "마감입니다~", 1, "글쓴이", "20220515")
        )

    fun getCommentList(boardId : Int): ArrayList<CommentEntity> {
        return commentList
    }
}
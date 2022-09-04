package com.bnk.bangtalchul.model.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.bnk.bangtalchul.model.entity.BoardEntity

class BoardRepository() {
    var board = BoardEntity(0, "", "", 0, "", 0)

    private var boardList :ArrayList<BoardEntity> = arrayListOf(
        BoardEntity(1, "팟 구해여", "포항사는 방탈출 러버 찾아요", 5, "20220815", 0),
        BoardEntity(2, "부산 서면 방탈출~~", "이번주 토욜 갈 사람 구함~", 4, "20220715", 0),
        BoardEntity(3, "근데 방탈출 할 때..", "금데 방탈출 할 때...", 3, "20220615", 0),
        BoardEntity(4, "음주 방탈출", "술마시고 방탈출 못하나?", 5,"20220515", 0),
        BoardEntity(5, "팟", "서울 팟 구함", 6,"20220415", 1),
        BoardEntity(6, "팟 구해여", "포항사는 방탈출 러버 찾아요", 5, "20220815", 0),
        BoardEntity(7, "부산 서면 방탈출~~", "이번주 토욜 갈 사람 구함~", 4, "20220715", 0),
        BoardEntity(8, "근데 방탈출 할 때..", "금데 방탈출 할 때...", 3, "20220615", 0),
        BoardEntity(9, "음주 방탈출", "술마시고 방탈출 못하나?", 5,"20220515", 0),
        BoardEntity(10, "팟", "서울 팟 구함", 6,"20220415", 1)

    )

    private var myBoardList :ArrayList<BoardEntity> = arrayListOf(
        BoardEntity(1, "팟 구해여", "포항사는 방탈출 러버 찾아요", 5, "20220815", 0),
        BoardEntity(2, "부산 서면 방탈출~~", "이번주 토욜 갈 사람 구함~", 4, "20220715", 0),
        BoardEntity(3, "근데 방탈출 할 때..", "금데 방탈출 할 때...", 3, "20220615", 0),
        BoardEntity(4, "음주 방탈출", "술마시고 방탈출 못하나?", 5,"20220515", 0),
    )

    fun getBoardList(): ArrayList<BoardEntity> {
        return boardList
    }

    fun getMyBoardList(): ArrayList<BoardEntity> {
        return myBoardList
    }

    /* api 호출
    private val boards: LiveData<List<BoardEntity>> = contactDao.getAll()

    fun getAll(): LiveData<List<BoardEntity>> {
        return boards
    }

    fun insert(board: BoardEntity) {

    }


    */
    fun delete(boardId: Int) {
        //api(boardId)
    }

}
package com.bnk.bangtalchul.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bnk.bangtalchul.model.entity.BoardEntity
import com.bnk.bangtalchul.model.repository.BoardRepository

class BoardViewModel() : ViewModel() {
    private val repository = BoardRepository()
    private val boards = repository.getBoardList()
    private val myBoards = repository.getMyBoardList()

    private lateinit var board : BoardEntity

    fun setBoard(board: BoardEntity) {
        this.board = board
    }

    fun getBoard(): BoardEntity {
        return this.board
    }

    fun getBoardList(): ArrayList<BoardEntity> {
        return this.boards
    }

    fun getMyBoardList(): ArrayList<BoardEntity> {
        return this.myBoards
    }

    /* api 호출
    fun getAll(): LiveData<List<BoardEntity>> {
        return this.boards
    }

    fun insert(contact: BoardEntity) {
    }


    */
    fun delete(boardId: Int) {
        repository.delete(boardId)
    }
}
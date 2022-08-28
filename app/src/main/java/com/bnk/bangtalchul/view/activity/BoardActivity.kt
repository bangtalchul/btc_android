package com.bnk.bangtalchul.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.databinding.ActivityBoardBinding
import com.bnk.bangtalchul.view.adapter.BoardAdapter
import com.bnk.bangtalchul.viewmodel.BoardViewModel

class BoardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBoardBinding

    private lateinit var boardViewModel: BoardViewModel

    private var linearLayoutManager: RecyclerView.LayoutManager? = null
    private lateinit var recyclerAdapter: BoardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)

        val type = intent.getStringExtra("from")

        val recyclerView: RecyclerView = findViewById(R.id.board_recyclerview)
        boardViewModel = BoardViewModel()
        recyclerAdapter = BoardAdapter(this)
        when (type){
            "HOME" -> recyclerAdapter.setList(boardViewModel.getBoardList())
            "MY_PAGE" -> recyclerAdapter.setList(boardViewModel.getMyBoardList())
        }

        boardViewModel = ViewModelProviders.of(this).get(BoardViewModel::class.java)

        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = recyclerAdapter
        /* api 호출시
        boardViewModel.getAll().observe(this, Observer<List<BoardEntity>> { contacts ->
            // Update UI

        });
        */
    }

    private fun deleteDialog(boardId: Int) {

    }


}

//리사이클러 클릭 이벤트
//https://mechacat.tistory.com/7
//https://yunaaaas.tistory.com/57
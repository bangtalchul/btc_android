package com.bnk.bangtalchul.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.widget.ImageButton
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

        //뒤로가기 버튼
        val backButton = findViewById<ImageButton>(R.id.backbutton)
        backButton.setOnClickListener {
            when (type){
                "HOME" -> fromHomeBack()
                "MY_PAGE" -> finish()
            }

        }
    }

    private fun fromHomeBack(){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onKeyDown(keycode: Int, event: KeyEvent?): Boolean {
        if (keycode == KeyEvent.KEYCODE_BACK) {
            finish()
            return true
        }
        return false
    }
    private fun deleteDialog(boardId: Int) {

    }


}

//리사이클러 클릭 이벤트
//https://mechacat.tistory.com/7
//https://yunaaaas.tistory.com/57
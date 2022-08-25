package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.BoardEntity
import com.bnk.bangtalchul.model.repository.CommentRepository
import com.bnk.bangtalchul.view.adapter.BoardAdapter
import com.bnk.bangtalchul.view.adapter.CommentAdapter
import com.bnk.bangtalchul.viewmodel.BoardViewModel

class BoardDetailActivity : AppCompatActivity() {
    lateinit var board : BoardEntity
    private lateinit var linearLayout : LinearLayout
    private lateinit var title : TextView
    private lateinit var content : TextView

    private lateinit var boardViewModel: BoardViewModel
    private val commentRepository = CommentRepository()

    private var linearLayoutManager: RecyclerView.LayoutManager? = null
    private lateinit var recyclerAdapter: CommentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_detail)

        // board info setting on view
        board = intent.getSerializableExtra("board") as BoardEntity

        linearLayout = findViewById(R.id.chatpage_bottomsheet)
        title = findViewById(R.id.chatpage_title_textview)
        content = findViewById(R.id.chatpage_expandable_layout);

        linearLayout.bringToFront()
        title.text = board.title
        content.text = board.content

        boardViewModel = BoardViewModel()


        // get comment list



        // comment data setting in view
        val recyclerView: RecyclerView = findViewById(R.id.board_recyclerview)
        boardViewModel = BoardViewModel()
        recyclerAdapter = CommentAdapter(this)

        recyclerAdapter.setList(commentRepository.getCommentList(board.boardId))

        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = recyclerAdapter


    }
}
package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.BoardEntity
import com.bnk.bangtalchul.model.repository.CommentRepository
import com.bnk.bangtalchul.model.repository.UserInfoRepository
import com.bnk.bangtalchul.view.adapter.BoardAdapter
import com.bnk.bangtalchul.view.adapter.CommentAdapter
import com.bnk.bangtalchul.viewmodel.BoardViewModel

class BoardDetailActivity : AppCompatActivity() {
    lateinit var board : BoardEntity
    private lateinit var boardViewModel: BoardViewModel
    private val commentRepository = CommentRepository()
    private val userInfoRepository = UserInfoRepository()

    private var linearLayoutManager: RecyclerView.LayoutManager? = null
    private lateinit var recyclerAdapter: CommentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_detail)

        // board info setting on view
        board = intent.getSerializableExtra("board") as BoardEntity
        boardViewModel = BoardViewModel()

        val linearLayout = findViewById<LinearLayout>(R.id.chatpage_bottomsheet)
        val title = findViewById<TextView>(R.id.chatpage_title_textview)
        val content = findViewById<TextView>(R.id.chatpage_expandable_layout)
        val editButton = findViewById<ImageButton>(R.id.edit_button)
        val deleteButton = findViewById<ImageButton>(R.id.delete_button)

        linearLayout.bringToFront()
        title.text = board.title
        content.text = board.content

        if(board.writerId != userInfoRepository.user.userId){
            editButton.visibility = View.GONE
            deleteButton.visibility = View.GONE
        }
        editButton.setOnClickListener {

        }
        deleteButton.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setMessage("해당 게시글을 삭제하겠습니까?")
                .setNegativeButton("NO") { _, _ -> }
                .setPositiveButton("YES") { _, _ ->
                    boardViewModel.delete(board.boardId)
                    finish()
                }
            builder.show()
        }








        //back button
        val backButton = findViewById<ImageButton>(R.id.chatpage_backbutton)
        backButton.setOnClickListener {
            finish()
        }


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
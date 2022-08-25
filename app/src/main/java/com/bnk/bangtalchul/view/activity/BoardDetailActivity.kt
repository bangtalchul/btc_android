package com.bnk.bangtalchul.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.BoardEntity
import com.bnk.bangtalchul.viewmodel.BoardViewModel

class BoardDetailActivity : AppCompatActivity() {
    lateinit var board : BoardEntity
    private lateinit var boardViewModel: BoardViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_detail)

        board = intent.getSerializableExtra("board") as BoardEntity

        val linearLayout = findViewById<LinearLayout>(R.id.chatpage_bottomsheet)
        val title = findViewById<TextView>(R.id.chatpage_title_textview)
        val content = findViewById<TextView>(R.id.chatpage_expandable_layout);

        linearLayout.bringToFront()
        title.text = board.title
        content.text = board.content


        boardViewModel = BoardViewModel()

    }
}
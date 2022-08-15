package com.bnk.bangtalchul.view.adapter

import android.app.Activity
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.BoardEntity
import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.viewmodel.BoardViewModel
import com.bnk.bangtalchul.viewmodel.MyPageViewModel

class BoardAdapter(activity: Activity) : RecyclerView.Adapter<BoardAdapter.ViewHolder>() {
    private val activity = activity
    private var list: ArrayList<BoardEntity> = arrayListOf()
    private var boardViewModel = BoardViewModel()
    private var myPageViewModel = MyPageViewModel()
    val userId = myPageViewModel.getUser().userId

    fun setList(boardList: ArrayList<BoardEntity>) {
        this.list = boardList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_board, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(list[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val title = itemView.findViewById<TextView>(R.id.board_title_textview)
        private val content = itemView.findViewById<TextView>(R.id.board_content_textview)
        private val timestamp = itemView.findViewById<TextView>(R.id.board_time_textview)
        private val commentNum = itemView.findViewById<TextView>(R.id.board_comment_num)
        private val deleteButton = itemView.findViewById<TextView>(R.id.board_delete_text_button)

        fun bind(board: BoardEntity) {
            title.text = board.title
            content.text = board.content
            timestamp.text = board.timestamp
            commentNum.text = board.commentNum.toString()

            if(board.writerId != userId){
                deleteButton.visibility = View.GONE
            }

            deleteButton.setOnClickListener {
                val builder = AlertDialog.Builder(activity)
                builder.setMessage("해당 게시글을 삭제하겠습니까?")
                    .setNegativeButton("NO") { _, _ -> }
                    .setPositiveButton("YES") { _, _ ->
                        boardViewModel.delete(board.boardId)
                    }
                builder.show()
            }

            deleteButton.setOnLongClickListener {
                //homeItemLongClick(home)
                true
            }
        }
    }
}
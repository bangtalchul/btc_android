package com.bnk.bangtalchul.view.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.BoardEntity
import com.bnk.bangtalchul.model.entity.CommentEntity
import com.bnk.bangtalchul.view.activity.BoardDetailActivity
import com.bnk.bangtalchul.viewmodel.BoardViewModel
import com.bnk.bangtalchul.viewmodel.MyPageViewModel

class CommentAdapter(activity: Activity) : RecyclerView.Adapter<CommentAdapter.ViewHolder>() {
    private val activity = activity
    private var commentList: ArrayList<CommentEntity> = arrayListOf()
    private var boardViewModel = BoardViewModel()
    private var myPageViewModel = MyPageViewModel()
    val userId = myPageViewModel.getUser().userId

    fun setList(commentList: ArrayList<CommentEntity>) {
        this.commentList = commentList
        notifyDataSetChanged()
    }

    fun getComment(position: Int): CommentEntity {
        return this.commentList[position];
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comment_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return commentList.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(commentList[position])
    }

    interface OnItemClickListener {
        fun onClick(v: View, position: Int)
    }

    fun setItemClickListener(onItemClickListener: OnItemClickListener) {
        this.itemClickListener = onItemClickListener
    }



    private lateinit var itemClickListener : OnItemClickListener

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val name = itemView.findViewById<TextView>(R.id.comment_writer_name_textview)
        private val content = itemView.findViewById<TextView>(R.id.comment_content_textview)
        private val timestamp = itemView.findViewById<TextView>(R.id.comment_time_textview)
        private val deleteButton = itemView.findViewById<TextView>(R.id.comment_delete_text_button)


        fun bind(comment: CommentEntity) {
            name.text = comment.writerName
            content.text = comment.content
            timestamp.text = comment.timestamp

            if(comment.writerId != userId){
                deleteButton.visibility = View.GONE
            }

            deleteButton.setOnClickListener {
                val builder = AlertDialog.Builder(activity)
                builder.setMessage("해당 게시글을 삭제하겠습니까?")
                    .setNegativeButton("NO") { _, _ -> }
                    .setPositiveButton("YES") { _, _ ->
                        boardViewModel.delete(comment.boardId)
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
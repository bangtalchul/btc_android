package com.bnk.bangtalchul.view.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.SearchEntity

class SearchAdapter : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {
    private var list: ArrayList<SearchEntity> = arrayListOf()

    fun setList(cafeList: ArrayList<SearchEntity>) {
        this.list = cafeList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.search_cardview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(list[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val name = itemView.findViewById<TextView>(R.id.name)
        private val address = itemView.findViewById<TextView>(R.id.address)
        // private val photoUrl = itemView.findViewById<ImageView>(R.id.photo_url)

        fun bind(home: SearchEntity) {
            name.text = home.name
            address.text = home.address

//            itemView.setOnClickListener {
//                homeItemClick(home)
//            }

//            itemView.setOnLongClickListener {
//                homeItemLongClick(home)
//                true
//            }
        }
    }
}
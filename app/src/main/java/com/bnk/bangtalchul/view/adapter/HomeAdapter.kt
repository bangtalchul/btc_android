package com.bnk.bangtalchul.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.HomeEntity
import kotlin.collections.ArrayList

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    private var list = ArrayList<HomeEntity>()

    fun setList(list: ArrayList<HomeEntity>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(list[position])

        viewHolder.itemView.setOnClickListener {
            itemClickListener.onClick(it, position)
        }
    }

    interface OnItemClickListener {
        fun onClick(v: View, position: Int)
    }

    fun setItemClickListener(onItemClickListener: OnItemClickListener) {
        this.itemClickListener = onItemClickListener
    }

    private lateinit var itemClickListener : OnItemClickListener

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val name = itemView.findViewById<TextView>(R.id.name)
        private val address = itemView.findViewById<TextView>(R.id.address)
        private val photoUrl = itemView.findViewById<ImageView>(R.id.photo_url)

        fun bind(home: HomeEntity) {
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
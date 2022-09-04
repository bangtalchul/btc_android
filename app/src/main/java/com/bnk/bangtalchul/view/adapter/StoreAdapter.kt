package com.bnk.bangtalchul.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.StoreEntity

class StoreAdapter : RecyclerView.Adapter<StoreAdapter.ViewHolder>() {
    private var list: ArrayList<StoreEntity> = arrayListOf()

    fun setList(storeList: ArrayList<StoreEntity>) {
        this.list = storeList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.store_item, parent, false)
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

        fun bind(store: StoreEntity) {
            name.text = store.name
            address.text = store.address

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
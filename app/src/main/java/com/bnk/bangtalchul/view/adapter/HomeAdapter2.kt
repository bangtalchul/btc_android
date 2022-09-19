package com.bnk.bangtalchul.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.HomeEntity
import kotlin.collections.ArrayList

class HomeAdapter2(val context: Context) : RecyclerView.Adapter<HomeAdapter2.ViewHolder>() {
    private var list = ArrayList<HomeEntity>()

    fun setList(list: ArrayList<HomeEntity>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.main_item2, parent, false)
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
        private val photoUrl = itemView.findViewById<ImageView>(R.id.photo_url)

        fun bind(home: HomeEntity) {
            name.text = home.name

            if (home.photoUrl != "") {
                val resourceId = context.resources.getIdentifier(home.photoUrl, "drawable", context.packageName)
                photoUrl?.setImageResource(resourceId)
            } else {
                photoUrl?.setImageResource(R.mipmap.ic_launcher)
            }
        }
    }
}
package com.bnk.bangtalchul.view.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.StoreEntity
import com.bnk.bangtalchul.model.entity.ThemeEntity
import com.bnk.bangtalchul.view.activity.StoreActivity
import com.bnk.bangtalchul.view.activity.ThemeActivity

class ThemeAdapter(activity: Activity) : RecyclerView.Adapter<ThemeAdapter.ViewHolder>() {
    private val activity = activity
    private var list: ArrayList<ThemeEntity> = arrayListOf()

    fun setList(themeList: ArrayList<ThemeEntity>) {
        this.list = themeList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.theme_item, parent, false)
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
        // private val address = itemView.findViewById<TextView>(R.id.address)
        // private val photoUrl = itemView.findViewById<ImageView>(R.id.photo_url)

        fun bind(theme: ThemeEntity) {
            // name.text = home.name
            // address.text = home.address

            itemView.setOnClickListener {
                var intent = Intent(activity, ThemeActivity::class.java)
                intent.putExtra("theme_id", theme.themeId)
                activity.startActivity(intent)
            }

//            itemView.setOnLongClickListener {
//                homeItemLongClick(home)
//                true
//            }
        }
    }
}
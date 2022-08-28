package com.bnk.bangtalchul.view.fragment

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.view.activity.StoreActivity
import com.bnk.bangtalchul.view.adapter.HomeAdapter
import com.bnk.bangtalchul.viewmodel.StoreViewModel
import com.bnk.bangtalchul.viewmodel.ThemeViewModel

/**
 * An example full-screen fragment that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    // private lateinit var binding: FragmentHomeBinding
    private lateinit var storeViewModel: StoreViewModel
    private lateinit var themeViewModel: ThemeViewModel

    private var linearLayoutManager: RecyclerView.LayoutManager? = null
    private lateinit var recyclerAdapter: HomeAdapter
    private var homeStoreList: ArrayList<HomeEntity> = arrayListOf()
    private var homeThemeList: ArrayList<HomeEntity> = arrayListOf()
    private var homeRegionList: ArrayList<HomeEntity> = arrayListOf()

    private lateinit var recyclerAdapter2: HomeAdapter
    private lateinit var recyclerAdapter3: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater!!.inflate(R.layout.fragment_home, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.mainRecyclerView)
        storeViewModel = StoreViewModel()
        homeStoreList = storeViewModel.getHomeStoreList()
        recyclerAdapter = HomeAdapter()
        recyclerAdapter.setList(homeStoreList)

        linearLayoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = recyclerAdapter

        val recyclerView2: RecyclerView = view.findViewById(R.id.mainRecyclerView2)
        recyclerAdapter2 = HomeAdapter()
        themeViewModel = ThemeViewModel()
        homeThemeList = themeViewModel.getHomeThemeList()
        recyclerAdapter2.setList(homeThemeList)
        linearLayoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

        recyclerView2.layoutManager = linearLayoutManager
        recyclerView2.adapter = recyclerAdapter2

        val recyclerView3: RecyclerView = view.findViewById(R.id.mainRecyclerView3)
        recyclerAdapter3 = HomeAdapter()
        homeRegionList = storeViewModel.getHomeRegionList("")
        recyclerAdapter3.setList(homeRegionList)
        linearLayoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

        recyclerView3.layoutManager = linearLayoutManager
        recyclerView3.adapter = recyclerAdapter3

        val spinner = view.findViewById<Spinner>(R.id.categoryComboBox)
        spinner.adapter = ArrayAdapter.createFromResource(view.context, R.array.catrgories, android.R.layout.simple_spinner_item)

        recyclerAdapter.setItemClickListener(object: HomeAdapter.OnItemClickListener{
            override fun onClick(v: View, position: Int) {
                var intent = Intent(activity, StoreActivity::class.java)

                intent.putExtra("store_id", homeStoreList[position].id.toString())
                startActivity(intent)
            }
        })

        recyclerAdapter2.setItemClickListener(object: HomeAdapter.OnItemClickListener{
            override fun onClick(v: View, position: Int) {
                var intent = Intent(activity, StoreActivity::class.java)

                intent.putExtra("theme_id", homeThemeList[position].id.toString())
                startActivity(intent)
            }
        })

        recyclerAdapter3.setItemClickListener(object: HomeAdapter.OnItemClickListener{
            override fun onClick(v: View, position: Int) {
                var intent = Intent(activity, StoreActivity::class.java)

                intent.putExtra("store_id", homeRegionList[position].id.toString())
                startActivity(intent)
            }
        })

        return view
    }
}
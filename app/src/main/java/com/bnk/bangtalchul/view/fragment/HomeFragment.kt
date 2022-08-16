package com.bnk.bangtalchul.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ArrayAdapter.createFromResource
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.model.entity.HomeEntity
import com.bnk.bangtalchul.view.adapter.HomeAdapter
import com.bnk.bangtalchul.viewmodel.HomeViewModel

/**
 * An example full-screen fragment that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    // private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel

    private var linearLayoutManager: RecyclerView.LayoutManager? = null
    private lateinit var recyclerAdapter: HomeAdapter
    private var itemList: ArrayList<HomeEntity> = arrayListOf()
    private var itemList2: ArrayList<HomeEntity> = arrayListOf()
    private var itemList3: ArrayList<HomeEntity> = arrayListOf()

    //var itemList2 = viewModel.getList2()
    //var itemList3 = viewModel.getRegionList("");
    private lateinit var recyclerAdapter2: HomeAdapter
    private lateinit var recyclerAdapter3: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater!!.inflate(R.layout.fragment_home, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.mainRecyclerView)
        viewModel = HomeViewModel()
        itemList = viewModel.getList()
        recyclerAdapter = HomeAdapter()
        recyclerAdapter.setList(itemList)

        linearLayoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = recyclerAdapter

        val recyclerView2: RecyclerView = view.findViewById(R.id.mainRecyclerView2)
        recyclerAdapter2 = HomeAdapter()
        itemList2 = viewModel.getList2()
        recyclerAdapter2.setList(itemList2)
        linearLayoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

        recyclerView2.layoutManager = linearLayoutManager
        recyclerView2.adapter = recyclerAdapter2

        val recyclerView3: RecyclerView = view.findViewById(R.id.mainRecyclerView3)
        recyclerAdapter3 = HomeAdapter()
        itemList3 = viewModel.getRegionList("")
        recyclerAdapter3.setList(itemList3)
        linearLayoutManager = LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)

        recyclerView3.layoutManager = linearLayoutManager
        recyclerView3.adapter = recyclerAdapter3

        val spinner = view.findViewById<Spinner>(R.id.categoryComboBox)
        spinner.adapter = ArrayAdapter.createFromResource(view.context, R.array.catrgories, android.R.layout.simple_spinner_item)

        recyclerAdapter.setItemClickListener(object: HomeAdapter.OnItemClickListener{
            override fun onClick(v: View, position: Int) {
                Toast.makeText(view.context,
                    itemList[position].id.toString(),
                    Toast.LENGTH_SHORT).show()
            }
        })

        recyclerAdapter2.setItemClickListener(object: HomeAdapter.OnItemClickListener{
            override fun onClick(v: View, position: Int) {


            }
        })

        recyclerAdapter3.setItemClickListener(object: HomeAdapter.OnItemClickListener{
            override fun onClick(v: View, position: Int) {
                // 클릭 시 이벤트 작성

            }
        })

        return view
    }
}
package com.bnk.bangtalchul.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.view.adapter.StoreAdapter
import com.bnk.bangtalchul.viewmodel.StoreViewModel

class SearchFragment : Fragment() {
    companion object {
        fun newInstance() = SearchFragment()
    }

    private lateinit var viewModel: StoreViewModel

    private var linearLayoutManager: RecyclerView.LayoutManager? = null
    private lateinit var recyclerAdapter: StoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater!!.inflate(R.layout.fragment_search, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.searchRecyclerView)
        viewModel = StoreViewModel()
        recyclerAdapter = StoreAdapter(this.requireContext())
        recyclerAdapter.setList(viewModel.getStoreList(""))
        linearLayoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = recyclerAdapter

        return view
    }
}
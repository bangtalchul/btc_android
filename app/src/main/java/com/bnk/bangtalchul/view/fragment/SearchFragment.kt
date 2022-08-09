package com.bnk.bangtalchul.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.databinding.FragmentHomeBinding
import com.bnk.bangtalchul.databinding.FragmentSearchBinding
import com.bnk.bangtalchul.view.adapter.HomeAdapter
import com.bnk.bangtalchul.view.adapter.SearchAdapter
import com.bnk.bangtalchul.viewmodel.HomeViewModel
import com.bnk.bangtalchul.viewmodel.SearchViewModel


class SearchFragment : Fragment() {
    companion object {
        fun newInstance() = SearchFragment()
    }

    private lateinit var binding: FragmentSearchBinding
    private lateinit var viewModel: SearchViewModel

    private var linearLayoutManager: RecyclerView.LayoutManager? = null
    private lateinit var recyclerAdapter: SearchAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater!!.inflate(R.layout.fragment_search, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.searchRecyclerView)
        viewModel = SearchViewModel()
        recyclerAdapter = SearchAdapter()
        recyclerAdapter.setList(viewModel.getList())
        linearLayoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = recyclerAdapter

        return view
    }
}
package com.bnk.bangtalchul.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.viewmodel.MyPageViewModel

class MyPageFragment : Fragment() {
    companion object {
        fun newInstance() = MyPageFragment()
    }

    private lateinit var viewModel: MyPageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_community, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyPageViewModel::class.java)
        // TODO: Use the ViewModel
    }
}
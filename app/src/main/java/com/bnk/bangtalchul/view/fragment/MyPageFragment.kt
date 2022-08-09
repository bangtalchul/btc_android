package com.bnk.bangtalchul.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.databinding.FragmentMypageBinding
import com.bnk.bangtalchul.viewmodel.HomeViewModel
import com.bnk.bangtalchul.viewmodel.MyPageViewModel

class MyPageFragment : Fragment() {
    companion object {
        fun newInstance() = MyPageFragment()
    }

    private lateinit var binding : FragmentMypageBinding   //데이터바인딩
    private lateinit var viewModel: MyPageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = MyPageViewModel() //viewModel 초기화
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_mypage, container, false) //데이터바인딩
        binding.viewModel = viewModel //data binding을 위해 viewModel 세팅
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyPageViewModel::class.java)
        // TODO: Use the ViewModel
    }
}
/*
https://jutole.tistory.com/m/12
https://apt-info.github.io/%EA%B0%9C%EB%B0%9C/android-layout-click/
xml
1. binding 을 위해 layout으로 감싸기
2. viewModel 세팅
fragment or activity main
1. viewModel 선언 및 초기화
2. data binding 해주기
 */
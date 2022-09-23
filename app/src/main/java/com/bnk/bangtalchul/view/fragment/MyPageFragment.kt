package com.bnk.bangtalchul.view.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.databinding.FragmentMypageBinding
import com.bnk.bangtalchul.util.eventObserve
import com.bnk.bangtalchul.view.activity.BoardActivity
import com.bnk.bangtalchul.view.activity.CollectionActivity
import com.bnk.bangtalchul.view.activity.MyPageEditActivity
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

        val fireWorkUnicode = 0x1F527
        val emojiText = "${String(Character.toChars(fireWorkUnicode))} 수정하기"
        binding.mypageEditButton.text = emojiText

        initObserve()
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyPageViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun initObserve() {

        viewModel.openEvent.eventObserve(this) { type ->
            lateinit var intent : Intent
            when (type) {
                0 -> intent = Intent(this.context, MyPageEditActivity::class.java)
                1 -> intent = Intent(this.context, BoardActivity::class.java)
                2 -> intent = Intent(this.context, BoardActivity::class.java)
                3 -> intent = Intent(this.context, BoardActivity::class.java)
                4 -> intent = Intent(this.context, CollectionActivity::class.java)
            }
            intent.putExtra("from", "MY_PAGE")
            startActivity(intent)
        }
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
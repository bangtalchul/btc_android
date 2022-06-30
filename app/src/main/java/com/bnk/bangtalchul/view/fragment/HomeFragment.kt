package com.bnk.bangtalchul.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.databinding.FragmentHomeBinding
import com.bnk.bangtalchul.viewmodel.HomeViewModel

/**
 * An example full-screen fragment that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class HomeFragment : Fragment() {

    // private val viewModel: HomeViewModel by viewModels()

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(
            inflater,
            container,
            false
        )

        viewModel.getData()
        binding.textview.text = viewModel.data.value
        return binding.root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
//        Log.e("aaaaaaaaaaaa", "aaaaaaaa")
//        viewModel.getData()
//        var aa: LiveData<String> = viewModel.data
//        var bb = aa.value
//        if (bb != null) {
//            Log.e("aaaaaaaaaaab", bb)
//        }
//
//    }
}
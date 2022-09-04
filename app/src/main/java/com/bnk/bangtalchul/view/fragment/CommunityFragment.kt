package com.bnk.bangtalchul.view.fragment

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bnk.bangtalchul.R
import com.bnk.bangtalchul.view.activity.BoardActivity
import com.bnk.bangtalchul.viewmodel.BoardViewModel

class CommunityFragment : Fragment() {

    companion object {
        fun newInstance() = CommunityFragment()
    }

    private lateinit var viewModel: BoardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_community, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BoardViewModel::class.java)
        var intent = Intent(this.context, BoardActivity::class.java)
        intent.putExtra("from", "HOME")
        startActivity(intent)
    }
}
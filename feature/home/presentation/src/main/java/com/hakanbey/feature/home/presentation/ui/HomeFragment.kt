package com.hakanbey.feature.home.presentation.ui

import androidx.fragment.app.viewModels
import com.hakanbey.common.presentation.base.BaseFragment
import com.hakanbey.common.presentation.util.fragmentViewBinding
import com.hakanbey.feature.home.presentation.R
import com.hakanbey.feature.home.presentation.adapter.HomeAdapter
import com.hakanbey.feature.home.presentation.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment(R.layout.fragment_home) {

    override val binding by fragmentViewBinding(FragmentHomeBinding::bind)
    override val viewModel: HomeViewModel by viewModels()

    private val adapter by lazy { HomeAdapter() }

    override fun bindUI() {
        binding.recyclerView.adapter = adapter
    }

    override fun bindViewModel() {
        viewModel.getAllCharacters()
        viewModel.characterList.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
    }

}
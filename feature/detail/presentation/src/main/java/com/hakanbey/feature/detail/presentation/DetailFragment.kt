package com.hakanbey.feature.detail.presentation

import androidx.fragment.app.viewModels
import com.hakanbey.common.presentation.base.BaseFragment
import com.hakanbey.common.presentation.util.fragmentViewBinding
import com.hakanbey.feature.detail.presentation.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : BaseFragment(R.layout.fragment_detail) {

    override val binding by fragmentViewBinding(FragmentDetailBinding::bind)
    override val viewModel: DetailViewModel by viewModels()

    override fun bindUI() {
        super.bindUI()
    }

    override fun bindViewModel() {
        super.bindViewModel()
    }

}
package com.hakanbey.feature.detail.presentation

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.hakanbey.common.presentation.base.BaseFragment
import com.hakanbey.common.presentation.util.fragmentViewBinding
import com.hakanbey.feature.detail.presentation.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : BaseFragment(R.layout.fragment_detail) {

    override val binding by fragmentViewBinding(FragmentDetailBinding::bind)
    override val viewModel: DetailViewModel by viewModels()

    private val args: DetailFragmentArgs by navArgs()

    override fun bindUI() {
        super.bindUI()
    }

    override fun bindViewModel() {
        super.bindViewModel()
        viewModel.getCharacterDetail(id = args.id)

        viewModel.characterDetail.observe(viewLifecycleOwner) {
            binding.textView.text = it.name
        }
    }

}
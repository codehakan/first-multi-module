package com.hakanbey.feature.detail.presentation

import android.widget.LinearLayout
import androidx.core.view.isGone
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import coil.load
import com.hakanbey.common.presentation.base.BaseFragment
import com.hakanbey.common.presentation.util.fragmentViewBinding
import com.hakanbey.feature.detail.presentation.component.PairView
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
            binding.imageProfile.load(it.image)
            binding.progressCircular.isGone = true
            binding.gridLayoutPersonalInfo.apply {
                addView(
                    prepareTextView(
                        Pair("Name", it.name)
                    )
                )
                addView(
                    prepareTextView(
                        Pair("Status", it.status)
                    )
                )
                addView(
                    prepareTextView(
                        Pair("Species", it.species)
                    )
                )
                addView(
                    prepareTextView(
                        Pair("Gender", it.gender)
                    )
                )
            }
        }
    }

    private fun prepareTextView(pair: Pair<String, String>): PairView {
        val pairView = PairView(binding.root.context)
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        pairView.layoutParams = params
        pairView.setUp(pair.first, pair.second)

        return pairView
    }

}
package com.hakanbey.feature.home.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.hakanbey.feature.home.domain.repository.entity.ResultEntity
import com.hakanbey.feature.home.presentation.databinding.ItemRickAndMortyBinding

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewRickAndMortyHolder>() {

    private var list: List<ResultEntity> = emptyList()
    private var setItemClickListener: (ResultEntity) -> Unit = {}

    inner class ViewRickAndMortyHolder(private val binding: ItemRickAndMortyBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ResultEntity) = with(binding) {
            human.text = item.species.orEmpty()
            status.text = item.status.orEmpty()
            name.text = item.name
            imageView.load(item.image)
            container.setOnClickListener { setItemClickListener.invoke(item) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewRickAndMortyHolder {
        return ViewRickAndMortyHolder(
            ItemRickAndMortyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewRickAndMortyHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    fun submitList(newList: List<ResultEntity>) {
        list = newList
        notifyDataSetChanged()
    }

    fun setItemClickListener(listener: (ResultEntity) -> Unit) {
        setItemClickListener = listener
    }


}
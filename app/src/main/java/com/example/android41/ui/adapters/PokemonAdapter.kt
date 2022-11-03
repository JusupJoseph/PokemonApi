package com.example.android41.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android41.base.BaseDiffUtilItemCallback
import com.example.android41.databinding.ItemPokemonListBinding
import com.example.android41.models.PokemonModel

class PokemonAdapter :
    ListAdapter<PokemonModel, PokemonAdapter.PokemonViewHolder>(BaseDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder =
        PokemonViewHolder(
            ItemPokemonListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    class PokemonViewHolder(private val binding: ItemPokemonListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: PokemonModel) {
            binding.tvName.text = model.name
        }

    }

}
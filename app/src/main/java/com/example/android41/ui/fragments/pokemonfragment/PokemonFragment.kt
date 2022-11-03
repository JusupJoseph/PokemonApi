package com.example.android41.ui.fragments.pokemonfragment

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android41.R
import com.example.android41.base.BaseFragment
import com.example.android41.databinding.FragmentListBinding
import com.example.android41.ui.adapters.PokemonAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PokemonFragment : BaseFragment<FragmentListBinding, PokemonViewModel>(R.layout.fragment_list) {

    override val binding by viewBinding(FragmentListBinding::bind)
    override val viewModel: PokemonViewModel by viewModels()
    private val adapter = PokemonAdapter()

    override fun initialize() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.rvListPokemon.adapter = adapter
    }

    override fun setupSubscribes() {
        viewModel.fetchPokemonName().subscribe(
            onSuccess = {
                adapter.submitList(it.result)
            },
            onError = {
                Log.e("pokemon", it )
            }
        )
    }
}


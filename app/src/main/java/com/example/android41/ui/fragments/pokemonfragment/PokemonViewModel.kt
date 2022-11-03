package com.example.android41.ui.fragments.pokemonfragment

import com.example.android41.base.BaseViewModel
import com.example.android41.data.repositories.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(private val repository: PokemonRepository) :
    BaseViewModel() {

    fun fetchPokemonName() = repository.fetchPokemonName()
}

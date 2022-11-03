package com.example.android41.data.repositories

import com.example.android41.base.BaseRepository
import com.example.android41.data.remote.apiservices.PokemonApiService
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val pokeApi: PokemonApiService): BaseRepository() {

    fun fetchPokemonName() = doRequest {
        pokeApi.fetchPokemonName()
    }
}
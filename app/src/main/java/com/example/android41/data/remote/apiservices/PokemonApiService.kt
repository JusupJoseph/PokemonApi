package com.example.android41.data.remote.apiservices

import com.example.android41.models.PokemonModel
import com.example.android41.models.PokemonResponse
import retrofit2.http.GET

interface PokemonApiService {

    @GET("pokemon")
    suspend fun fetchPokemonName(): PokemonResponse<PokemonModel>
}
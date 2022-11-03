package com.example.android41.models

import com.example.android41.base.IBaseDiffModel
import com.google.gson.annotations.SerializedName

data class PokemonModel(
    @SerializedName("id")
    override val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String,
): IBaseDiffModel<Int>

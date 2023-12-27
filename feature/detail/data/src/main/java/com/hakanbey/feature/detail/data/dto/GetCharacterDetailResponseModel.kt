package com.hakanbey.feature.detail.data.dto

data class GetCharacterDetailResponseModel(
    val id: String,
    val name: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: Origin,
    val location: Location,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
)

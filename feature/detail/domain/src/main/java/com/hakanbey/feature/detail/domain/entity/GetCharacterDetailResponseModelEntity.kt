package com.hakanbey.feature.detail.domain.entity

data class GetCharacterDetailResponseModelEntity(
    val id: String,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: OriginEntity,
    val location: LocationEntity,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
)

package com.hakanbey.feature.home.domain.repository.entity

data class ResultEntity(
    var created: String?,
    var episode: List<String?>?,
    var gender: String?,
    var id: Int?,
    var image: String?,
    var location: LocationEntity?,
    var name: String?,
    var origin: OriginEntity?,
    var species: String?,
    var status: String?,
    var type: String?,
    var url: String?
)

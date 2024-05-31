package com.hakanbey.feature.home.data.mapper

import com.hakanbey.feature.home.data.dto.Result
import com.hakanbey.feature.home.domain.repository.entity.ResultEntity

fun Result.resultToEntity() = ResultEntity(
    created = this.created,
    episode = this.episode,
    gender = this.gender,
    id = this.id,
    image = this.image,
    location = this.location?.locationToEntity(),
    name = this.name,
    origin = this.origin?.originToEntity(),
    species = this.species,
    status = this.status,
    type = this.type,
    url = this.url
)

fun List<Result?>?.resultToEntity() = this?.map {
    it?.resultToEntity()
}
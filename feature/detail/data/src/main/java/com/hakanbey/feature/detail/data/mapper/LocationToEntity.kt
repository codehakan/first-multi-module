package com.hakanbey.feature.detail.data.mapper

import com.hakanbey.feature.detail.data.dto.Location
import com.hakanbey.feature.detail.domain.entity.LocationEntity

fun Location.toEntity() =
    LocationEntity(
        name = this.name,
        url = this.url
    )
package com.hakanbey.feature.home.data.mapper

import com.hakanbey.feature.home.data.dto.Location
import com.hakanbey.feature.home.domain.repository.entity.LocationEntity

fun Location.locationToEntity() = LocationEntity(
    name = this.name,
    url = this.url
)
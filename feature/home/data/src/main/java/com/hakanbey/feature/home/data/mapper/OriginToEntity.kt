package com.hakanbey.feature.home.data.mapper

import com.hakanbey.feature.home.data.dto.Origin
import com.hakanbey.feature.home.domain.repository.entity.OriginEntity

fun Origin.originToEntity() = OriginEntity(
    name = this.name,
    url = this.url
)
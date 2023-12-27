package com.hakanbey.feature.detail.data.mapper

import com.hakanbey.feature.detail.data.dto.Origin
import com.hakanbey.feature.detail.domain.entity.OriginEntity

fun Origin.toEntity() =
    OriginEntity(
        name = this.name,
        url = this.url
    )
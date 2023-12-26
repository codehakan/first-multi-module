package com.hakanbey.feature.home.data.mapper

import com.hakanbey.feature.home.data.dto.Info
import com.hakanbey.feature.home.domain.repository.entity.InfoEntity

fun Info.infoToEntity() = InfoEntity(
    count = this.count,
    next = this.next,
    pages = this.pages,
    prev = this.prev
)
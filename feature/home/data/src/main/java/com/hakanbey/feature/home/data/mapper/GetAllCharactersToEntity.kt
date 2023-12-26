package com.hakanbey.feature.home.data.mapper

import com.hakanbey.feature.home.data.dto.GetAllCharacterResponseModel
import com.hakanbey.feature.home.domain.repository.entity.GetAllCharacterResponseModelEntity

fun GetAllCharacterResponseModel.getAllCharacterToEntity() =
    GetAllCharacterResponseModelEntity(
        info = this.info?.infoToEntity(),
        results = this.results.resultToEntity()
    )


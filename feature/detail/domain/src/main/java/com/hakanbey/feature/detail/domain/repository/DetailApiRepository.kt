package com.hakanbey.feature.detail.domain.repository

import com.hakanbey.common.data.dto.NetworkWrapper
import com.hakanbey.feature.detail.domain.entity.GetCharacterDetailResponseModelEntity
import kotlinx.coroutines.flow.Flow

interface DetailApiRepository {

    suspend fun getCharacterDetail(id: String): Flow<NetworkWrapper<GetCharacterDetailResponseModelEntity>>

}
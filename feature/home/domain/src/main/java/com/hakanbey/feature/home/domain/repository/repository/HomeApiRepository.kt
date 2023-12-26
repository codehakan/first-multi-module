package com.hakanbey.feature.home.domain.repository.repository

import com.hakanbey.common.data.dto.NetworkWrapper
import com.hakanbey.feature.home.domain.repository.entity.GetAllCharacterResponseModelEntity
import kotlinx.coroutines.flow.Flow

interface HomeApiRepository {

    suspend fun getAllCharacters(): Flow<NetworkWrapper<GetAllCharacterResponseModelEntity>>

}
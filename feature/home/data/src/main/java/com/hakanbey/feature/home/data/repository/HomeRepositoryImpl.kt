package com.hakanbey.feature.home.data.repository

import com.hakanbey.common.data.base.BaseRepository
import com.hakanbey.common.data.dto.NetworkWrapper
import com.hakanbey.common.data.util.mapResponseToEntity
import com.hakanbey.feature.home.data.datasource.HomeDataSource
import com.hakanbey.feature.home.data.mapper.getAllCharacterToEntity
import com.hakanbey.feature.home.domain.repository.entity.GetAllCharacterResponseModelEntity
import com.hakanbey.feature.home.domain.repository.repository.HomeApiRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val homeDataSource: HomeDataSource
) : HomeApiRepository, BaseRepository() {

    override suspend fun getAllCharacters(): Flow<NetworkWrapper<GetAllCharacterResponseModelEntity>> {
        return safeApiCall { homeDataSource.getAllCharacters() }.mapResponseToEntity { it.getAllCharacterToEntity() }
    }

}


package com.hakanbey.feature.detail.data.repository

import com.hakanbey.common.data.base.BaseRepository
import com.hakanbey.common.data.dto.NetworkWrapper
import com.hakanbey.common.data.util.mapResponseToEntity
import com.hakanbey.feature.detail.data.datasource.DetailDataSource
import com.hakanbey.feature.detail.data.mapper.toEntity
import com.hakanbey.feature.detail.domain.entity.GetCharacterDetailResponseModelEntity
import com.hakanbey.feature.detail.domain.repository.DetailApiRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DetailRepositoryImpl @Inject constructor(
    private val detailDataSource: DetailDataSource
) : DetailApiRepository, BaseRepository() {

    override suspend fun getCharacterDetail(id: String): Flow<NetworkWrapper<GetCharacterDetailResponseModelEntity>> {
        return safeApiCall { detailDataSource.getCharacterDetail(id) }.mapResponseToEntity { it.toEntity() }
    }

}
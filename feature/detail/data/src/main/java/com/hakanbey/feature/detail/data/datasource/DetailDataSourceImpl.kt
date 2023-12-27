package com.hakanbey.feature.detail.data.datasource

import com.hakanbey.feature.detail.data.api.DetailApi
import com.hakanbey.feature.detail.data.dto.GetCharacterDetailResponseModel
import retrofit2.Response
import javax.inject.Inject

class DetailDataSourceImpl @Inject constructor(
    private val detailApi: DetailApi
) : DetailDataSource {

    override suspend fun getCharacterDetail(id: String): Response<GetCharacterDetailResponseModel> {
        return detailApi.getCharacterDetail(id)
    }

}
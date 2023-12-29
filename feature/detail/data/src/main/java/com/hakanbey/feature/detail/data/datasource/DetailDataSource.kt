package com.hakanbey.feature.detail.data.datasource

import com.hakanbey.feature.detail.data.dto.GetCharacterDetailResponseModel
import retrofit2.Response

interface DetailDataSource {

    suspend fun getCharacterDetail(id: String): Response<GetCharacterDetailResponseModel>

}
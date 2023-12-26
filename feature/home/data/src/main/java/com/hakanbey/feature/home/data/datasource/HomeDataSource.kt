package com.hakanbey.feature.home.data.datasource

import com.hakanbey.feature.home.data.dto.GetAllCharacterResponseModel
import retrofit2.Response

interface HomeDataSource {

    suspend fun getAllCharacters(): Response<GetAllCharacterResponseModel>

}
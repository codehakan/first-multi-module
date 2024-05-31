package com.hakanbey.feature.home.data.datasource

import com.hakanbey.feature.home.data.api.HomeApi
import com.hakanbey.feature.home.data.dto.GetAllCharacterResponseModel
import retrofit2.Response
import javax.inject.Inject

class HomeDataSourceImpl @Inject constructor(
    private val homeApi: HomeApi
) : HomeDataSource {

    override suspend fun getAllCharacters(): Response<GetAllCharacterResponseModel> {
        return homeApi.getAllCharacters()
    }

}
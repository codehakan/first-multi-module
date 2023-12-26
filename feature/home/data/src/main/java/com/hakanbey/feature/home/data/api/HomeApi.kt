package com.hakanbey.feature.home.data.api

import com.hakanbey.feature.home.data.dto.GetAllCharacterResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface HomeApi {

    @GET("character")
    suspend fun getAllCharacters(): Response<GetAllCharacterResponseModel>

}
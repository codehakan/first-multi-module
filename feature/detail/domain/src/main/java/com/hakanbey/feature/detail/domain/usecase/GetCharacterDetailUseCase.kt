package com.hakanbey.feature.detail.domain.usecase

import com.hakanbey.feature.detail.domain.repository.DetailApiRepository
import javax.inject.Inject

class GetCharacterDetailUseCase @Inject constructor(
    private val detailApiRepository: DetailApiRepository
) {

    suspend fun invoke(id: String) = detailApiRepository.getCharacterDetail(id)

}
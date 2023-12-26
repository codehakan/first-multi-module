package com.hakanbey.feature.home.domain.repository.usecase

import com.hakanbey.feature.home.domain.repository.repository.HomeApiRepository
import javax.inject.Inject

class GetAllCharacterUseCase @Inject constructor(
    private val homeApiRepository: HomeApiRepository
) {

    suspend fun invoke() = homeApiRepository.getAllCharacters()

}
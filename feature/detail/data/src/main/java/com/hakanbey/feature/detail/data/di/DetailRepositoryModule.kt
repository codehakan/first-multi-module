package com.hakanbey.feature.detail.data.di

import com.hakanbey.feature.detail.data.datasource.DetailDataSource
import com.hakanbey.feature.detail.data.repository.DetailRepositoryImpl
import com.hakanbey.feature.detail.domain.repository.DetailApiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DetailRepositoryModule {

    @Provides
    @Singleton
    fun provideDetailHomeRepository(detailDataSource: DetailDataSource): DetailApiRepository =
        DetailRepositoryImpl(detailDataSource)

}
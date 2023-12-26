package com.hakanbey.feature.home.data.di

import com.hakanbey.feature.home.data.datasource.HomeDataSource
import com.hakanbey.feature.home.data.repository.HomeRepositoryImpl
import com.hakanbey.feature.home.domain.repository.repository.HomeApiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HomeRepositoryModule {

    @Provides
    @Singleton
    fun provideHomeRepository(homeDataSource: HomeDataSource): HomeApiRepository =
        HomeRepositoryImpl(homeDataSource)

}
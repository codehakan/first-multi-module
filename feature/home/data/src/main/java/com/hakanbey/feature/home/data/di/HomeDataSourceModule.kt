package com.hakanbey.feature.home.data.di

import com.hakanbey.feature.home.data.datasource.HomeDataSource
import com.hakanbey.feature.home.data.datasource.HomeDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface HomeDataSourceModule {

    @Binds // Mutlaka Module altında olmalı
    @Singleton
    fun provideHomeDataSourceModule(dataSource: HomeDataSourceImpl): HomeDataSource

}

/*@EntryPoint
@InstallIn(SingletonComponent::class)
interface MyInterface {

    fun myFun(): String

}*/

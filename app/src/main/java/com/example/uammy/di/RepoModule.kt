package com.example.uammy.di

import com.example.data.remote.ApiService
import com.example.data.repoImp.mealsRepoImp
import com.example.domian.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo (apiService: ApiService):MealsRepo{
        return mealsRepoImp(apiService)
    }


}
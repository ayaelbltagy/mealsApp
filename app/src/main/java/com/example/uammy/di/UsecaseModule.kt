package com.example.uammy.di

import com.example.domian.repo.MealsRepo
import com.example.domian.usecase.getMealsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UsecaseModule {

    @Provides
    fun provideUseCase( repo: MealsRepo): getMealsUseCase {
        return getMealsUseCase(repo)
    }
}
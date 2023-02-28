package com.example.data.repoImp

import com.example.data.remote.ApiService
import com.example.domian.repo.MealsRepo

class mealsRepoImp(private val api: ApiService) : MealsRepo {
    override suspend fun getMealsFromRemote()= api.getMeals()
}
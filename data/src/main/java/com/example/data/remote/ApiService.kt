package com.example.data.remote

import com.example.domian.entities.mealsModel
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getMeals(): mealsModel
}
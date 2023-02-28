package com.example.domian.repo

import com.example.domian.entities.mealsModel

interface MealsRepo {

    // get all meals from server
   suspend fun getMealsFromRemote(): mealsModel
}
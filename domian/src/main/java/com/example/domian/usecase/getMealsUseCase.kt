package com.example.domian.usecase

import com.example.domian.repo.MealsRepo

class getMealsUseCase (private val repo: MealsRepo) {
    suspend operator fun invoke () = repo.getMealsFromRemote()
}
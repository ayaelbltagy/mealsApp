package com.example.uammy

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domian.entities.mealsModel
import com.example.domian.usecase.getMealsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor (private val useCase: getMealsUseCase) : ViewModel() {

    private val _list :MutableStateFlow<mealsModel?> = MutableStateFlow(null)
    val list : StateFlow<mealsModel?> = _list
    fun getAllRemoteMeals(){
        viewModelScope.launch {
            try {
                _list.value = useCase()

            }catch (e:Exception){

            }
        }
    }
}
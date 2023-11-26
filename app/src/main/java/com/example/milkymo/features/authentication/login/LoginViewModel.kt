package com.example.milkymo.features.authentication.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.milkymo.domain.usecases.AppEntryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val appEntryUseCases: AppEntryUseCases
):ViewModel(){
    fun onEvent(event: LoginEvent){
        when(event){
            is LoginEvent.SaveAppEntry ->{
                saveUserEntry()
            }

            else -> {}
        }
    }

    private fun saveUserEntry() {
        viewModelScope.launch {
            appEntryUseCases.saveAppEntry
        }
    }
}
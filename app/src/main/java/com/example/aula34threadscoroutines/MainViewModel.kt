package com.example.aula34threadscoroutines

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel(val repository: Repository): ViewModel() {

    val res = MutableLiveData<String>()

    fun getFilmesRepo(){
        viewModelScope.launch {
            try {
                res.value = repository.getFilmes()
            }catch (e: Exception){
                Log.e("MainViewModel", "Erro ao acessar repo")
            }
        }
    }
}
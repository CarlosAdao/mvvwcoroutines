package com.example.aula34threadscoroutines

import kotlinx.coroutines.delay

class Repository {

    suspend fun getFilmes(): String{
        delay(9000)
        return "Resultado"
    }

}
package com.example.clase3_23_08

import com.example.clase3_23_08.model.DogResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    //  Definimos los métodos que usaremos para interactuar con la API

    //  Indicamos qué método vamos a usar y declaramos la función
    @GET
    fun getDogsByBreed(@Url url:String):Response<DogResponse>
}
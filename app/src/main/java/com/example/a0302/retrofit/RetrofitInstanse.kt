package com.example.a0302.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstanse {
    val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl("mskko2021.mad.hakta.pro/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: RetrofitInterface by lazy {
        retrofit.create(RetrofitInterface::class.java)
    }
}
package com.example.a0302.retrofit


import com.example.a0302.retrofit.models.LoginModelGet
import com.example.a0302.retrofit.models.LoginModelPost
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RetrofitInterface {
    @POST ("user/login")
    fun login (@Body logins : LoginModelPost) : Call<LoginModelGet>
}
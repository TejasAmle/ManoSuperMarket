package com.example.manosupermarket.network

import com.example.manosupermarket.model.DataModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {
    @GET("/api/ End Point")
    suspend fun getOrders(): Response<DataModel>
}
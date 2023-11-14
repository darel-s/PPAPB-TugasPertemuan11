package com.example.tugaspertemuan11.network

import com.example.tugaspertemuan11.model.ApiResponse
import com.example.tugaspertemuan11.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("assets")
    fun getCryptoData(): Call<ApiResponse>
}

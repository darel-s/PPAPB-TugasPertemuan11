package com.example.tugaspertemuan11.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("data") val data: List<CryptoModel>
)

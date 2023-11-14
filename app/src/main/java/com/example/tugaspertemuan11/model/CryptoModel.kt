package com.example.tugaspertemuan11.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
    @SerializedName("symbol") val symbol: String,
    @SerializedName("name") val name: String,
    @SerializedName("priceUsd") val priceUsd: String
)

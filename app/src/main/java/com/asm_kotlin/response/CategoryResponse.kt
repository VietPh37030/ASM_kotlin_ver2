package com.asm_kotlin.response

import com.google.gson.annotations.SerializedName

data class CategoryResponse(
    @SerializedName("_id") val cateID: String,
    val cateName: String,
    val image: String
)

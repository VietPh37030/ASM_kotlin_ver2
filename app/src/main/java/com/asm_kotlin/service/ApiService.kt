package com.asm_kotlin.service

import com.asm_kotlin.request.LoginRequest
import com.asm_kotlin.request.RegisterRequest
import com.asm_kotlin.response.CategoryResponse
import com.asm_kotlin.response.ProductResponse
import com.asm_kotlin.response.Response


import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query


interface ApiService {
    @POST("register")
    suspend fun register(@Body registerReq: RegisterRequest): Response?

    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): Response?

    @GET("categories")
    suspend fun getCategories(): List<CategoryResponse>

    @GET("products")
    suspend fun getProducts(@Query("cateID") cateID: String?): List<ProductResponse>
//
    @GET("get-product-by-id/{productID}")
    suspend fun getProductByID(@Path("productID") productID: String?): ProductResponse?



}
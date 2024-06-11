package com.asm_kotlin.request

data class RegisterRequest(
    val email: String,
    val password: String,
    val fullname: String
)

package com.mobileprogramming.mvpkotlin.Model

interface UserImpl {
    fun getEmail(): String
    fun getPassword(): String
    fun isValid(): Boolean
}
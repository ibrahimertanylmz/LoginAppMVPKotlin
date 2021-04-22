package com.mobileprogramming.mvpkotlin.Model

import android.text.TextUtils
import android.util.Patterns

class User(email: String, password: String) {

    private var email: String = "mail"
    private var password: String = "pw"
    init {
        this.email = email
        this.password = password
    }

    fun getEmail(): String {
        return this.email
    }
    fun getPassword(): String {
        return this.password
    }
    fun isValid(): Boolean {
          return !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()&&
                getPassword().length > 6;
    }

}
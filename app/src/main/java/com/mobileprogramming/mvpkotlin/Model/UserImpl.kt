package com.mobileprogramming.mvpkotlin.Model

import android.text.TextUtils
import android.util.Patterns

class User(email: String, password: String): UserImpl {

    private var email: String = "mail"
    private var password: String = "pw"
    init {
        this.email = email
        this.password = password
    }

    override fun getEmail(): String {
        return this.email
    }
    override fun getPassword(): String {
        return this.password
    }
    override fun isValid(): Boolean {
          return !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()&&
                getPassword().length > 6;
    }

}
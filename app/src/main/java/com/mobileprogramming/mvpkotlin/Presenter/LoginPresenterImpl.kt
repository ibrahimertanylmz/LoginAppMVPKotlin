package com.mobileprogramming.mvpkotlin.Presenter

import com.mobileprogramming.mvpkotlin.Model.User
import com.mobileprogramming.mvpkotlin.View.LoginView

class LoginPresenterImpl(internal var LoginView: LoginView) : LoginPresenter {

    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        var isLoginSuccess = user.isValid()
        if(isLoginSuccess)
            LoginView.onLoginResult("Succesful Login!")
        else
            LoginView.onLoginResult("Error!")
    }


}
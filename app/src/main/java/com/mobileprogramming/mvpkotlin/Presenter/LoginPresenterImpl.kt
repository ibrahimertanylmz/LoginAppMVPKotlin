package com.mobileprogramming.mvpkotlin.Presenter

import com.mobileprogramming.mvpkotlin.Model.User
import com.mobileprogramming.mvpkotlin.View.LoginView

class LoginPresenter(internal var LoginView: LoginView) : LoginPresenterImpl {

    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        var isLoginSuccess = user.isValid()
        if(isLoginSuccess)
            LoginView.onLoginResult("Succesful Login!")
        else
            LoginView.onLoginResult("Error!")
    }

}
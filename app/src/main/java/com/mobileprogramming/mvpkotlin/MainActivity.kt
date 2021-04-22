package com.mobileprogramming.mvpkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mobileprogramming.mvpkotlin.Presenter.LoginPresenter
import com.mobileprogramming.mvpkotlin.View.LoginView

class MainActivity : AppCompatActivity(),LoginView {

    internal lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        buttonLogin.setOnClickListener
        {
            loginPresenter.onLogin()
        }

    }
    override fun onLoginResult(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}

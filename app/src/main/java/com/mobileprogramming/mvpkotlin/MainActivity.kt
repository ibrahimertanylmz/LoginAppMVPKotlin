package com.mobileprogramming.mvpkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mobileprogramming.mvpkotlin.Presenter.LoginPresenter
import com.mobileprogramming.mvpkotlin.Presenter.LoginPresenterImpl
import com.mobileprogramming.mvpkotlin.View.LoginView
import com.mobileprogramming.mvpkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),LoginView {

    internal lateinit var loginPresenter: LoginPresenter
    lateinit var binding: ActivityMainBinding
    var string: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        loginPresenter = LoginPresenterImpl(this)

        binding.apply {
            buttonLogin.setOnClickListener {
                loginPresenter.onLogin(edtEmail.text.toString(), edtPassword.text.toString())
            }
        }
               

        binding.edtEmail.text.toString().let { txt->
            txt
        }

        string?.let { str ->
            str
        } ?: run {

        }


        binding.buttonLogin.setOnClickListener {
            loginPresenter.onLogin(binding.edtEmail.text.toString(), binding.edtPassword.text.toString())
        }

    }

    override fun onLoginResult(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}

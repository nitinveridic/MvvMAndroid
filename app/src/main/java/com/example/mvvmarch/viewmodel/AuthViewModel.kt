package com.example.mvvmarch.viewmodel

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import com.example.mvvmarch.ui.auth.AuthListner
import com.example.mvvmarch.ui.auth.SignUpActivity

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null
    var authListner: AuthListner?=null


    fun onLoginButtonClick() {
        authListner?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListner?.onFauiler("The credentails are not valid")
            return
        }
        authListner?.onSuccess("User Loged In")



    }




    fun onSignUpButtonClick() {
        authListner?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListner?.onFauiler("The credentails are not valid")
            return
        }
        authListner?.onSuccess("User Signed Up")

    }

    fun onForgetPasswordButtonClick() {
        authListner?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListner?.onFauiler("The credentails are not valid")
            return
        }
        authListner?.onSuccess("User Signed Up")

    }





}
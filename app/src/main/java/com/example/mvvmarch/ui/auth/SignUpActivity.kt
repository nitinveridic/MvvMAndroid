package com.example.mvvmarch.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmarch.R
import com.example.mvvmarch.databinding.ActivityMainBinding
import com.example.mvvmarch.databinding.ActivitySignUpBinding
import com.example.mvvmarch.hide
import com.example.mvvmarch.show
import com.example.mvvmarch.toastt
import com.example.mvvmarch.viewmodel.AuthViewModel

class SignUpActivity : AppCompatActivity() , AuthListner {
    lateinit var authViewDatBinding: ActivitySignUpBinding
    lateinit var authViewModel: AuthViewModel;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authViewDatBinding= DataBindingUtil.setContentView(this, R.layout.activity_sign_up)
        authViewModel= ViewModelProvider(this).get(AuthViewModel::class.java)
        authViewDatBinding.signupviewmodel=authViewModel
        authViewModel.authListner=this


    }

    override fun onStarted() {
        authViewDatBinding.progressBar.show()
    }

    override fun onSuccess(message: String) {
        authViewDatBinding.progressBar.hide()
        toastt(message)
    }

    override fun onFauiler(message: String) {
        authViewDatBinding.progressBar.hide()
        toastt(message)
    }
}
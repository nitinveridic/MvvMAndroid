package com.example.mvvmarch.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmarch.*
import com.example.mvvmarch.databinding.ActivityMainBinding
import com.example.mvvmarch.viewmodel.AuthViewModel

class LogInActivity : AppCompatActivity(), AuthListner {
    lateinit var authViewDatBinding:ActivityMainBinding
    lateinit var authViewModel: AuthViewModel;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authViewDatBinding=DataBindingUtil.setContentView(this, R.layout.activity_main)
        authViewModel=ViewModelProvider(this).get(AuthViewModel::class.java)
        authViewDatBinding.loginviewmodel=authViewModel
        authViewModel.authListner=this



    }

    override fun onStarted() {
        authViewDatBinding.progressBar.show()
    }

    override fun onSuccess(message: String) {
        authViewDatBinding.progressBar.hide()
        toastt(message)
        intent  = Intent(this, SignUpActivity::class.java)
        startActivity(intent)

    }

    override fun onFauiler(message: String) {
        authViewDatBinding.progressBar.hide()
        toastt(message)
    }
}
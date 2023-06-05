package com.example.mvvmarch.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.mvvmarch.R
import com.example.mvvmarch.databinding.ActivitySplashBinding
import com.example.mvvmarch.hide
import com.example.mvvmarch.show
import com.example.mvvmarch.toastt
import com.example.mvvmarch.ui.auth.LogInActivity
import com.example.mvvmarch.ui.auth.SignUpActivity
import com.example.mvvmarch.viewmodel.SplashViewModel

class SplashActivity : AppCompatActivity(), SplashListner {
    lateinit var splashViewDatBinding: ActivitySplashBinding
    lateinit var splashViewModel: SplashViewModel;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        splashViewDatBinding= DataBindingUtil.setContentView(this, R.layout.activity_splash)
        splashViewModel= ViewModelProvider(this).get(SplashViewModel::class.java)
        splashViewDatBinding.splashviewmodel=splashViewModel
        splashViewModel.splashListner=this
        splashViewModel.startSplashScreen()

    }

    override fun onStarted() {
        Glide.with(this)
            .asGif()
            .load(R.drawable.gify)
            .into(splashViewDatBinding.ivGif)
    }

    override fun onFinish() {
        intent  = Intent(this, LogInActivity::class.java)
        startActivity(intent)
        this.finish()
    }


}
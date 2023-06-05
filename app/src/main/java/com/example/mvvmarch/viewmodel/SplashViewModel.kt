package com.example.mvvmarch.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvmarch.ui.auth.AuthListner
import com.example.mvvmarch.ui.splash.SplashListner
import java.util.*
import kotlin.concurrent.schedule

class SplashViewModel: ViewModel() {

    var firstTime=false;

    var splashListner: SplashListner?=null

    fun startSplashScreen() {
        if (!firstTime) {
            firstTime = true
            splashListner?.onStarted()
        }else{
            splashListner?.onFinish()
        }

        Timer().schedule(4000) {
            splashListner?.onFinish()
        }
    }







}
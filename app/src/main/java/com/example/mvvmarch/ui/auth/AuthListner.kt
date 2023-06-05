package com.example.mvvmarch.ui.auth

interface AuthListner {
    fun onStarted()
    fun onSuccess(message:String)
    fun onFauiler(message: String)
}
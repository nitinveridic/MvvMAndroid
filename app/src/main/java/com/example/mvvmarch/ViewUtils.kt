package com.example.mvvmarch

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.mvvmarch.ui.auth.SignUpActivity

fun Context.toastt(message:String)
{
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
}


fun ProgressBar.show()
{
    ProgressBar.VISIBLE
}

fun ProgressBar.hide()
{
    ProgressBar.INVISIBLE
}


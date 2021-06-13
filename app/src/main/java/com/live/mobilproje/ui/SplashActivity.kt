package com.live.mobilproje.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.live.mobilproje.R
import com.live.mobilproje.utils.UiHelper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if (UiHelper.hasInternetConnection(this)) {
            loadSplashScreen()
        } else {
            UiHelper.customErrorDialog(this, "Connection failed")
        }
    }

    private fun loadSplashScreen() {
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}
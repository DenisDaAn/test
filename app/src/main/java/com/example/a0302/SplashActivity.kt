package com.example.a0302

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val timer = object : CountDownTimer(3000, 1000) {

            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                val intent = Intent(this@SplashActivity, OnboardingActivity::class.java)
                startActivity(intent)
            }
        }.start()
    }
}
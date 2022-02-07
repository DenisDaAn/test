package com.example.a0302

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
    }
    fun gomain(view: View){
        val intent = Intent(this@OnboardingActivity, LoginActivity::class.java)
        startActivity(intent)
    }
}
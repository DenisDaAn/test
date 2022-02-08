package com.example.a0302
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a0302.retrofit.RetrofitInstanse
import com.example.a0302.retrofit.models.LoginModelGet
import com.example.a0302.retrofit.models.LoginModelPost
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun log() {
        val email = textLogin.toString()
        val password = textPassword.toString()
        if (!email.isEmpty()|| !password.isEmpty()) {
            val service = RetrofitInstanse.api
            val call = service.login(LoginModelPost("wsr", "wsr"))
            call.enqueue(object : Callback<LoginModelGet> {
                override fun onResponse(call: Call<LoginModelGet>, response: Response<LoginModelGet>) {
                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    startActivity(intent)
                }
                override fun onFailure(call: Call<LoginModelGet>, t: Throwable) {
                    val toast = Toast.makeText(applicationContext, "не работает", Toast.LENGTH_SHORT)
                    toast.show()
                }

            })

        }
    }
}


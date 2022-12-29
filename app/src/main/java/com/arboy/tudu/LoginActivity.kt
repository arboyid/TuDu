package com.arboy.tudu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackLoginListener()
        btnRegisterListener()
    }
    private fun btnBackLoginListener() {
    L_back.setOnClickListener {
        startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private  fun btnRegisterListener() {
        l_btn_Regis.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

}

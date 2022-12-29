package com.arboy.tudu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        btnBackRegisterListener()
        btnLoginListener()
    }
    private fun btnBackRegisterListener() {
        rback.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private  fun btnLoginListener() {
        rbtn_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

}

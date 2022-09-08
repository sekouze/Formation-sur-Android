package com.sekouze.odcui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class facebook_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook_login)

        val btn=findViewById<Button>(R.id.login)

        btn.setOnClickListener {
            val intent=Intent(this@facebook_login,MainActivity::class.java)

            startActivity(intent);
        }
    }
}
package com.sekouze.odcui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        //recuperation des données
        val txtV_mail=findViewById<TextView>(R.id.home_activity_username)
        val email_value=intent.getStringExtra("email")
        txtV_mail.text=email_value


    }
}
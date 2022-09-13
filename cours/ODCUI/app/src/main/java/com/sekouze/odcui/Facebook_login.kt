package com.sekouze.odcui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Facebook_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook_login)

        val btn_login=findViewById<Button>(R.id.activity_facebook_login)
        val input_login=findViewById<EditText>(R.id.activity_facebook_userName)
        val input_pwd=findViewById<EditText>(R.id.activity_facebook_password)
        val txtV_fpwd=findViewById<TextView>(R.id.activity_facebook_fpwd)
        val txtV_signup=findViewById<TextView>(R.id.activity_facebook_signup)

//        println(btn_login.text)

        btn_login.setOnClickListener {
            if(input_login.text.isEmpty() || input_pwd.text.isEmpty())
                Toast.makeText(this,"Les champs ne doivent pas être vides ",Toast.LENGTH_SHORT).show()
            else{
                Toast.makeText(this,"Bienvenu ${input_login.text}   Pwd=${input_pwd.text}", Toast.LENGTH_SHORT).show()
                val intent=Intent(this@Facebook_login,Home::class.java)
                intent.putExtra("email",input_login.text.toString())
                intent.putExtra("password",input_pwd.text.toString())

                startActivity(intent)
            }

        }

        txtV_signup.setOnClickListener {
            val intent=Intent(this@Facebook_login,Singnup::class.java)
            startActivity(intent)
        }
    }
}
package com.myfirstapp.odc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button =findViewById<Button>(R.id.btn_login)  //recupreation de  l'indentifiant d'un btn
        button.setOnClickListener {
            val intent =Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent);
        }
    }
}
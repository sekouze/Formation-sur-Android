package com.sekouze.odctodoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AddTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

        val btn=findViewById<Button>(R.id.activity_add_task_add)
        val title=findViewById<TextView>(R.id.activity_add_task_title)

        btn.setOnClickListener {
            intent.putExtra("title",title.text.toString())
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}
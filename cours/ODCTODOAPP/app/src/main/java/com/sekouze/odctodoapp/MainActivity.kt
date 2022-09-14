package com.sekouze.odctodoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.actions.FloatAction
import android.widget.Button
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.sekouze.odctodoapp.classes.Task
import com.sekouze.odctodoapp.classes.TaskAdapter

class MainActivity : AppCompatActivity() {
    private val viewModel:TaskViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addBtn=findViewById<FloatingActionButton>(R.id.activity_main_add)


        addBtn.setOnClickListener {
            val intent =Intent(this@MainActivity,AddTaskActivity::class.java)
            startActivityForResult(intent,2);





        }

        val recyclerView=findViewById<RecyclerView>(R.id.activity_main_recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val adapter=TaskAdapter()
        recyclerView.adapter=adapter

        viewModel.tasks.observe(this){
            tasks->adapter.submitList(tasks)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==2 && resultCode== RESULT_OK){
            title=data?.getStringExtra("title")
            val task=Task(title = title.toString(), iscompleted = true)
            viewModel.insertTask(task)
        }
    }
}

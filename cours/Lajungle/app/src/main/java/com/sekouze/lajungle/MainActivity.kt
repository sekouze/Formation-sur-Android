package com.sekouze.lajungle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.felin_list)

        val recycle_view=findViewById<RecyclerView>(R.id.rv_felin_list)
        val layout_manager=LinearLayoutManager(this)
        recycle_view.layoutManager=layout_manager
    }
}
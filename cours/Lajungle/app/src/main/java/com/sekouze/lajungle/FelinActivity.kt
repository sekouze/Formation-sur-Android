package com.sekouze.lajungle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FelinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.felin_list)


        val recycle_view=findViewById<RecyclerView>(R.id.rv_felin_list)
        val layout_manager= LinearLayoutManager(this)
        recycle_view.layoutManager=layout_manager


        //Listes des felins
        val felins = listOf(
            Felin("Tigre", 86.0, R.drawable.tigre),
            Felin("Lynx", 86.0, R.drawable.lynx),
            Felin("Guepard", 86.0, R.drawable.guepard),
            Felin("Leopard", 86.0, R.drawable.leopard),
            Felin("Cougar", 86.0, R.drawable.lion),
            Felin("Chat", 86.0, R.drawable.chat),
            Felin("Cougar", 86.0, R.drawable.cougar),
        )

        val adapter=FelinAdapter(felins)


        recycle_view.adapter=adapter
    }
}
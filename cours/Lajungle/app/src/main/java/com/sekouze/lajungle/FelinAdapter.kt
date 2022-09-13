package com.sekouze.lajungle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FelinAdapter(val felins:List<Felin>):RecyclerView.Adapter<FelinAdapter.FelinVeiwHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FelinVeiwHolder {
        val context=parent.context
        val inflatter=LayoutInflater.from(context)
        val view =inflatter.inflate(R.layout.list_item,parent,false)
        return FelinVeiwHolder(view)
    }

    override fun onBindViewHolder(holder: FelinVeiwHolder, position: Int) {
        val item=felins.get(position)
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return felins.size
    }

    class FelinVeiwHolder(val itemView:View):RecyclerView.ViewHolder(itemView){
            val image=itemView.findViewById<ImageView>(R.id.list_item_imageView)
            val nom=itemView.findViewById<TextView>(R.id.list_item_nom)
            val vitesse=itemView.findViewById<TextView>(R.id.list_item_vitesse)

        fun bind(felin:Felin){
            image.setImageResource(felin.imageId)
            nom.text=felin.nom
            vitesse.text=felin.vitesse.toString()
        }
    }


}
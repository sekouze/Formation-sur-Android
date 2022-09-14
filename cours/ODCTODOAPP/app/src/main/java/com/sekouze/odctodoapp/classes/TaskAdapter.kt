package com.sekouze.odctodoapp.classes

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sekouze.odctodoapp.R

class TaskAdapter:ListAdapter<Task,TaskAdapter.TaskViewHolder>(TaskDiffUtil()) {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val context=parent.context
        val inflater=LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.liste_item,parent,false)


        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task=getItem(position)
        holder.bind(task)
    }

    class TaskViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val checkbox=itemView.findViewById<CheckBox>(R.id.list_item_checkBox)
        val title=itemView.findViewById<TextView>(R.id.list_item_textView)

        fun bind(task: Task){
            title.text=task.title
            title.paint.isStrikeThruText=task.iscompleted
            checkbox.isChecked=task.iscompleted
        }
    }

    class TaskDiffUtil():DiffUtil.ItemCallback<Task>() {
        override fun areItemsTheSame(oldItem: Task, newItem: Task): Boolean {
            return oldItem.id==newItem.id
        }

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: Task, newItem: Task): Boolean {
            return oldItem==newItem
        }
    }
}
package com.sekouze.odctodoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.sekouze.odctodoapp.classes.Task
import com.sekouze.odctodoapp.classes.TaskAdapter

class MainActivity : AppCompatActivity(), TaskAdapter.IOnTaskClickListner {
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
        val adapter=TaskAdapter(this)
        recyclerView.adapter=adapter

        viewModel.tasks.observe(this){
            tasks->adapter.submitList(tasks)
        }

        val itemTouchCallback= object :
            ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                viewModel.deleteTask(adapter.getTaskAtPosition(viewHolder.adapterPosition))
            }

        }

        val itemTouchHelper=ItemTouchHelper(itemTouchCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        //tester si le result a pour status (2 ou3)
        /*
            status=2: s'il s'agit de l'ajout
            status=3: s'il s'agit de la modification

         */
        if(requestCode==2 && resultCode== RESULT_OK){
            title=data?.getStringExtra("title")
            val task=Task(title = title.toString(), iscompleted = true)
            viewModel.insertTask(task)
        }
//        else
//        {
//            title=data?.getStringExtra("title")
//            val task=Task(title = title.toString(), iscompleted = true)
//            viewModel.insertTask(task)
//        }
//

    }




    //implementation des deux methodes de l'interface <<IOnTaskClickListner>> se trouvant dans la classe <<TaskAdapter>>
    override fun onTastClick(task: Task) {
        val intent=Intent(this@MainActivity,AddTaskActivity::class.java)
        intent.putExtra("title",task.title).toString()

        startActivityForResult(intent,3)
    }

    override fun onCheckBoxClick(task: Task, isClicked: Boolean) {
        viewModel.onTaskCompleted(task,isClicked)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.item_delete_all){
            viewModel.deleteAll()
        }

            return super.onOptionsItemSelected(item)
    }
}

package com.sekouze.odctodoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sekouze.odctodoapp.classes.App
import com.sekouze.odctodoapp.classes.Task
import com.sekouze.odctodoapp.classes.TaskAdapter
import com.sekouze.odctodoapp.classes.TaskDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TaskViewModel:ViewModel() {
   private val dao=TaskDatabase.getTastDaoInstance(App.getappContext())

   val tasks:LiveData<List<Task>> =dao.getTask()

   fun insertTask(task: Task){
      viewModelScope.launch {
         withContext(Dispatchers.IO){
            dao.insertTask(task)
         }

      }
   }


   fun updateTask(task: Task){
      viewModelScope.launch {
         withContext(Dispatchers.IO){
            dao.updateTask(task)
         }

      }
   }

   fun deleteTask(task: Task){
      viewModelScope.launch {
         withContext(Dispatchers.IO){
            dao.deleteTask(task)
         }

      }
   }
//
//   fun getTasks(){
//      viewModelScope.launch {
//         withContext(Dispatchers.IO){
//            dao.deleteTask(task)
//         }
//
//      }
//   }

}
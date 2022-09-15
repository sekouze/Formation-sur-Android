package com.sekouze.odctodoapp.classes

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao()
interface ITaskDao {

    @Query("select * from tasks")
     fun getTask():LiveData<List<Task>>

    @Insert
    suspend fun insertTask(task:Task)

    @Delete
    suspend fun deleteTask(task:Task)

    @Update
    suspend fun updateTask(task:Task)

    @Query("delete from tasks")
    fun deleteAll()
}
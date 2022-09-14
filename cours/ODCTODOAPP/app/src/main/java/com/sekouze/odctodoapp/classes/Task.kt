package com.sekouze.odctodoapp.classes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
class Task(
    @PrimaryKey(autoGenerate = true)
    val id:Int=0,
    @ColumnInfo(name = "title")
    val title:String,
    @ColumnInfo(name = "iscompleted")
    val iscompleted:Boolean)
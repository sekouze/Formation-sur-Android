package com.sekouze.odctodoapp.classes

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Task::class], exportSchema =false, version=1)
abstract class TaskDatabase:RoomDatabase() {
    abstract fun taskDao():ITaskDao

    companion object{
        @Volatile
        private  var INSTANCE:ITaskDao?=null


        fun getTastDaoInstance(context: Context):ITaskDao{

            synchronized(this)
            {
                var instance= INSTANCE

                if(instance==null){
                    instance= buildDatabase(context).taskDao()
                    INSTANCE=instance
                }
                return instance
            }
        }
        private  fun buildDatabase(context:Context):TaskDatabase {
            return  Room.databaseBuilder(
                context.applicationContext,
            TaskDatabase::class.java,
            "tak_database").fallbackToDestructiveMigration().build()
        }
    }
}
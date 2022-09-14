package com.sekouze.odctodoapp.classes

import android.app.Application

class App:Application() {

    init {
        app=this
    }


    companion object{
        lateinit var app: Application

        fun getappContext()=app.applicationContext
    }
}
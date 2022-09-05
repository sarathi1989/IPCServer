package com.sf.ipcserver

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        Log.v("Sarathi","MyService onBind")
        return binder
    }

    override fun onCreate() {
        super.onCreate()
        Log.v("Sarathi","MyServiceCreated")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("Sarathi","MyServiceDestroy")
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.v("Sarathi","MyService onUnbind")
        return super.onUnbind(intent)
    }


    val binder : IMyAidlInterface.Stub = object : IMyAidlInterface.Stub(){
        override fun basicTypes(
            anInt: Int,
            aLong: Long,
            aBoolean: Boolean,
            aFloat: Float,
            aDouble: Double,
            aString: String?
        ) {
            TODO("Not yet implemented")
        }

        override fun getMessage(name: String?): String {
            return "Hello : ${name}"
        }

        override fun getAddition(val1: Int, val2: Int): Int {
            return val1 + val2
        }

    }

}
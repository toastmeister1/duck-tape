package com.joseph.duck_tape

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DuckTapeApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}
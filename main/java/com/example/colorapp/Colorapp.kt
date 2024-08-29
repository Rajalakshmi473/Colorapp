package com.example.colorapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class YourApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize other components if needed
    }
}
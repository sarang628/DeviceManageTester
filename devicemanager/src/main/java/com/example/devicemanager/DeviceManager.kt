package com.example.devicemanager

import android.os.Build

class DeviceManager {
    val user: String
        get() = Build.USER
}
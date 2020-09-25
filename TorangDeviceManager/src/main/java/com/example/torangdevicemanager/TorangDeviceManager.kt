package com.example.torangdevicemanager

import android.os.Build
import com.example.data.DeviceInfo
import com.example.devicemanager.DeviceManager

class TorangDeviceManager : com.example.data.DeviceManager {
    override fun getDeviceInfo(): DeviceInfo {
        val deviceManager = DeviceManager()
        return DeviceInfo().apply {
            model = Build.MODEL
        }
    }
}
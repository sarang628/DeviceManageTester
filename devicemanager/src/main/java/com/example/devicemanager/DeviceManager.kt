package com.example.devicemanager

import android.content.Context
import android.os.Build
import android.util.DisplayMetrics
import android.view.WindowManager

class DeviceManager {
    val user: String get() = Build.USER

    private fun getWindowManager(context: Context): WindowManager {
        return context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    }

    fun getDisplayId(context: Context): Int {
        return getWindowManager(context).defaultDisplay.displayId
    }

    fun getRefreshRate(context: Context): Float {
        return getWindowManager(context).defaultDisplay.refreshRate
    }

    fun getRotation(context: Context): Int {
        return getWindowManager(context).defaultDisplay.rotation
    }

    fun getDensity(context: Context): Float {
        var displayMetrics = DisplayMetrics()
        getWindowManager(context).defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.density
    }

    fun getDensityDpi(context: Context): Int {
        var displayMetrics = DisplayMetrics()
        getWindowManager(context).defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.densityDpi
    }

    fun getHeightPixels(context: Context): Int {
        var displayMetrics = DisplayMetrics()
        getWindowManager(context).defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.heightPixels
    }

    fun getScaledDensity(context: Context): Float {
        var displayMetrics = DisplayMetrics()
        getWindowManager(context).defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.scaledDensity
    }

    fun getWidthPixels(context: Context): Int {
        var displayMetrics = DisplayMetrics()
        getWindowManager(context).defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.widthPixels
    }

    fun getxDpi(context: Context): Float {
        var displayMetrics = DisplayMetrics()
        getWindowManager(context).defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.xdpi
    }

    fun getyDpi(context: Context): Float {
        var displayMetrics = DisplayMetrics()
        getWindowManager(context).defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.ydpi
    }
}
package com.module.networkmanager.util

import android.util.Log
import com.module.networkmanager.BuildConfig

object LogUtil {
    private const val MODULE_NAME = "NetworkManager"

    fun logD(contents: String) {
        if(BuildConfig.DEBUG) {
            Log.d(MODULE_NAME, "$contents")
        }
    }

    fun logE(contents: String) {
        if(BuildConfig.DEBUG) {
            Log.e(MODULE_NAME, "$contents")
        }
    }

    fun printStackTrace(e: Exception) {
        if(BuildConfig.DEBUG) {
            e.printStackTrace()
        }
    }
}
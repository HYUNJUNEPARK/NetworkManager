package com.ex.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ex.app.NetworkConnectionCallback

abstract class BaseActivity : AppCompatActivity() {
    val networkCheck: NetworkConnectionCallback by lazy { NetworkConnectionCallback(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        networkCheck.register()
    }

    override fun onDestroy() {
        super.onDestroy()

        networkCheck.unregister()
    }
}
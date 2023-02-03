package com.ex.app.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ex.app.R
import com.ex.app.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.main = this
    }

    fun checkNetworkState() {
        binding.typeTextView.text = networkCheck.networkType
        binding.stateTextView.text = networkCheck.networkState
    }
}
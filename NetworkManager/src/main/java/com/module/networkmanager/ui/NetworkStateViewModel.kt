package com.module.networkmanager.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class NetworkStateViewModel(application: Application) : AndroidViewModel(application) {
    private val context = getApplication<Application>().applicationContext

    //네트워크 타입 데이터 ex. WIFI, LTE 등
    private val _networkType = MutableLiveData<String>()
    val networkType : LiveData<String>
        get() = _networkType

    //네트워크 연결 상태 데이터
    private val _networkState = MutableLiveData<String>()
    val networkState : LiveData<String>
        get() = _networkState

    fun registerNetworkManager() {

    }

    fun unregisterNetworkManager() {

    }
}
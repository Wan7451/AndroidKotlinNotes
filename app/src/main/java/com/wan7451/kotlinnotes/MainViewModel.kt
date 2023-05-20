package com.wan7451.kotlinnotes

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class MainViewModel: ViewModel() {

    val count = mutableStateOf(0)

    val flow = flow {
        var time = 0
        while (true){
            emit(time)
            delay(1000)
            time++
            count.value = time
        }
    }

}
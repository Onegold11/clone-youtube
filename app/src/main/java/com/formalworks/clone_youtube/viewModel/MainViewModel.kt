package com.formalworks.clone_youtube.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.formalworks.clone_youtube.network.VideoDataSource
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val dataSource = VideoDataSource()

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->

        throwable.printStackTrace()
    }

    fun getVideoList() = viewModelScope.launch(this.exceptionHandler) {

        val result = dataSource.service.listVideos()
        if (result.isSuccessful) {

            result.body()?.let {
                Log.d("test111", it.toString())
            }
        }
    }
}
package com.formalworks.clone_youtube.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class VideoDataSource {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://61cc0881198df60017aebe33.mockapi.io")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(VideoService::class.java)
}
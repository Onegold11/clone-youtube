package com.formalworks.clone_youtube.network

import com.formalworks.clone_youtube.data.VideoDto
import retrofit2.Response
import retrofit2.http.GET

interface VideoService {

    @GET("/videos")
    suspend fun listVideos(): Response<VideoDto>
}
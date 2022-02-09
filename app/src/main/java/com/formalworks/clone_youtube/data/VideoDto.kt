package com.formalworks.clone_youtube.data


import com.google.gson.annotations.SerializedName

data class VideoDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("videos")
    val videos: List<VideoModel>
)
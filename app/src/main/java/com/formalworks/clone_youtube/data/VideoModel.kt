package com.formalworks.clone_youtube.data


import com.google.gson.annotations.SerializedName

data class VideoModel(
    @SerializedName("description")
    val description: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("thumb")
    val thumb: String,
    @SerializedName("title")
    val title: String
)
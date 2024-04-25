package com.unik.acharyaprashant.data.model

import com.google.gson.annotations.SerializedName

data class Thumbnail(
    @SerializedName("id") val id: String,
    @SerializedName("version") val version: Long,
    @SerializedName("domain") val domain: String,
    @SerializedName("basePath") val basePath: String,
    @SerializedName("key") val key: String,
    @SerializedName("qualities") val qualities: List<Long>,
    @SerializedName("aspectRatio") val aspectRatio: Long
)

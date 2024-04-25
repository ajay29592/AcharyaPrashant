package com.unik.acharyaprashant.data.model

import com.google.gson.annotations.SerializedName

import me.acharya.mvvm.utils.AppConstant

data class ImageElement(


    @SerializedName("id")
    val id: String="",
    @SerializedName("title")val title: String,
    @SerializedName("language")val language: AppConstant.Language,
    @SerializedName("thumbnail")val thumbnail: Thumbnail,
    @SerializedName("mediaType")val mediaType: Long,
    @SerializedName("coverageURL")val coverageURL: String,
    @SerializedName("publishedAt")val publishedAt: String,
    @SerializedName("publishedBy")val publishedBy: String,
    @SerializedName("backupDetails")val backupDetails: BackupDetails? = null
)




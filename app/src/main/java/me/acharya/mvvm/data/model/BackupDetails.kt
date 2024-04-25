package com.unik.acharyaprashant.data.model

import com.google.gson.annotations.SerializedName

data class BackupDetails(
    @SerializedName("pdfLink") val pdfLink: String,
    @SerializedName("screenshotURL") val screenshotURL: String

)

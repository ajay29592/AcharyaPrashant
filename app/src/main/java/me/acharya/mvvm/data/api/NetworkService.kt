package me.acharya.mvvm.data.api

import com.unik.acharyaprashant.data.model.ImageElement
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface NetworkService {

//    @Headers("X-Api-Key: $API_KEY")
    @GET("api/v2/content/misc/media-coverages")
    suspend fun getTopHeadlines(@Query("limit") country: String): List<ImageElement>

}
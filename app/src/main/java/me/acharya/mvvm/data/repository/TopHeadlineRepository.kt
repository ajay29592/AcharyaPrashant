package me.acharya.mvvm.data.repository

import com.unik.acharyaprashant.data.model.ImageElement
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import me.acharya.mvvm.data.api.NetworkService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TopHeadlineRepository @Inject constructor(private val networkService: NetworkService) {

    fun getTopHeadlines(limit: String): Flow<List<ImageElement>> {
        return flow {
            emit(networkService.getTopHeadlines(limit))
        }.map {
            it
        }
    }

}
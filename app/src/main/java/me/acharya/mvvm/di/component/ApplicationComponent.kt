package me.acharya.mvvm.di.component

import android.content.Context
import dagger.Component
import me.acharya.mvvm.MVVMApplication
import me.acharya.mvvm.data.api.NetworkService
import me.acharya.mvvm.data.repository.TopHeadlineRepository
import me.acharya.mvvm.di.ApplicationContext
import me.acharya.mvvm.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MVVMApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}
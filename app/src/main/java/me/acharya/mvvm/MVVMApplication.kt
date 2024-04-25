package me.acharya.mvvm

import android.app.Application
import me.acharya.mvvm.di.component.ApplicationComponent
import me.acharya.mvvm.di.component.DaggerApplicationComponent
import me.acharya.mvvm.di.module.ApplicationModule

class MVVMApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }

}
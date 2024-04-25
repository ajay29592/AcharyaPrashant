package me.acharya.mvvm.di.component

import dagger.Component
import me.acharya.mvvm.di.ActivityScope
import me.acharya.mvvm.di.module.ActivityModule
import me.acharya.mvvm.ui.topheadline.TopHeadlineActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}
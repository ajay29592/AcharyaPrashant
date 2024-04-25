package me.acharya.mvvm.di.component;

import java.lang.System;

@me.acharya.mvvm.di.ActivityScope
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lme/acharya/mvvm/di/component/ActivityComponent;", "", "inject", "", "activity", "Lme/acharya/mvvm/ui/topheadline/TopHeadlineActivity;", "app_debug"})
@dagger.Component(dependencies = {me.acharya.mvvm.di.component.ApplicationComponent.class}, modules = {me.acharya.mvvm.di.module.ActivityModule.class})
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    me.acharya.mvvm.ui.topheadline.TopHeadlineActivity activity);
}
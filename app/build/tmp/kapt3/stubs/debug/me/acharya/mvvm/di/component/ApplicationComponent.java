package me.acharya.mvvm.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lme/acharya/mvvm/di/component/ApplicationComponent;", "", "getContext", "Landroid/content/Context;", "getNetworkService", "Lme/acharya/mvvm/data/api/NetworkService;", "getTopHeadlineRepository", "Lme/acharya/mvvm/data/repository/TopHeadlineRepository;", "inject", "", "application", "Lme/acharya/mvvm/MVVMApplication;", "app_debug"})
@dagger.Component(modules = {me.acharya.mvvm.di.module.ApplicationModule.class})
@javax.inject.Singleton
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    me.acharya.mvvm.MVVMApplication application);
    
    @org.jetbrains.annotations.NotNull
    @me.acharya.mvvm.di.ApplicationContext
    public abstract android.content.Context getContext();
    
    @org.jetbrains.annotations.NotNull
    public abstract me.acharya.mvvm.data.api.NetworkService getNetworkService();
    
    @org.jetbrains.annotations.NotNull
    public abstract me.acharya.mvvm.data.repository.TopHeadlineRepository getTopHeadlineRepository();
}
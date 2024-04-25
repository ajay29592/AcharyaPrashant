package me.acharya.mvvm.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lme/acharya/mvvm/di/module/ApplicationModule;", "", "application", "Lme/acharya/mvvm/MVVMApplication;", "(Lme/acharya/mvvm/MVVMApplication;)V", "provideBaseUrl", "", "provideContext", "Landroid/content/Context;", "provideGsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "provideNetworkService", "Lme/acharya/mvvm/data/api/NetworkService;", "baseUrl", "gsonConverterFactory", "app_debug"})
@dagger.Module
public final class ApplicationModule {
    private final me.acharya.mvvm.MVVMApplication application = null;
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull
    me.acharya.mvvm.MVVMApplication application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @me.acharya.mvvm.di.ApplicationContext
    @dagger.Provides
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @me.acharya.mvvm.di.BaseUrl
    @dagger.Provides
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.converter.gson.GsonConverterFactory provideGsonConverterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final me.acharya.mvvm.data.api.NetworkService provideNetworkService(@org.jetbrains.annotations.NotNull
    @me.acharya.mvvm.di.BaseUrl
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory) {
        return null;
    }
}
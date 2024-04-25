package me.acharya.mvvm.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lme/acharya/mvvm/di/module/ActivityModule;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "provideContext", "Landroid/content/Context;", "provideTopHeadlineAdapter", "Lme/acharya/mvvm/ui/topheadline/TopHeadlineAdapter;", "provideTopHeadlineViewModel", "Lme/acharya/mvvm/ui/topheadline/TopHeadlineViewModel;", "topHeadlineRepository", "Lme/acharya/mvvm/data/repository/TopHeadlineRepository;", "app_debug"})
@dagger.Module
public final class ActivityModule {
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
    public ActivityModule(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @me.acharya.mvvm.di.ActivityContext
    @dagger.Provides
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final me.acharya.mvvm.ui.topheadline.TopHeadlineViewModel provideTopHeadlineViewModel(@org.jetbrains.annotations.NotNull
    me.acharya.mvvm.data.repository.TopHeadlineRepository topHeadlineRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final me.acharya.mvvm.ui.topheadline.TopHeadlineAdapter provideTopHeadlineAdapter() {
        return null;
    }
}
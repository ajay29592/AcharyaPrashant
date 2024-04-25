package me.acharya.mvvm.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lme/acharya/mvvm/data/repository/TopHeadlineRepository;", "", "networkService", "Lme/acharya/mvvm/data/api/NetworkService;", "(Lme/acharya/mvvm/data/api/NetworkService;)V", "getTopHeadlines", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/unik/acharyaprashant/data/model/ImageElement;", "limit", "", "app_debug"})
@javax.inject.Singleton
public final class TopHeadlineRepository {
    private final me.acharya.mvvm.data.api.NetworkService networkService = null;
    
    @javax.inject.Inject
    public TopHeadlineRepository(@org.jetbrains.annotations.NotNull
    me.acharya.mvvm.data.api.NetworkService networkService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.unik.acharyaprashant.data.model.ImageElement>> getTopHeadlines(@org.jetbrains.annotations.NotNull
    java.lang.String limit) {
        return null;
    }
}
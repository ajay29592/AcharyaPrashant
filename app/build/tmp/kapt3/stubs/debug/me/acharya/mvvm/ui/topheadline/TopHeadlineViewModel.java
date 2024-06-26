package me.acharya.mvvm.ui.topheadline;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lme/acharya/mvvm/ui/topheadline/TopHeadlineViewModel;", "Landroidx/lifecycle/ViewModel;", "topHeadlineRepository", "Lme/acharya/mvvm/data/repository/TopHeadlineRepository;", "(Lme/acharya/mvvm/data/repository/TopHeadlineRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lme/acharya/mvvm/ui/base/UiState;", "", "Lcom/unik/acharyaprashant/data/model/ImageElement;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchTopHeadlines", "", "app_debug"})
public final class TopHeadlineViewModel extends androidx.lifecycle.ViewModel {
    private final me.acharya.mvvm.data.repository.TopHeadlineRepository topHeadlineRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<me.acharya.mvvm.ui.base.UiState<java.util.List<com.unik.acharyaprashant.data.model.ImageElement>>> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<me.acharya.mvvm.ui.base.UiState<java.util.List<com.unik.acharyaprashant.data.model.ImageElement>>> uiState = null;
    
    public TopHeadlineViewModel(@org.jetbrains.annotations.NotNull
    me.acharya.mvvm.data.repository.TopHeadlineRepository topHeadlineRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<me.acharya.mvvm.ui.base.UiState<java.util.List<com.unik.acharyaprashant.data.model.ImageElement>>> getUiState() {
        return null;
    }
    
    private final void fetchTopHeadlines() {
    }
}
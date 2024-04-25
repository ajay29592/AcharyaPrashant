package me.acharya.mvvm.ui.topheadline;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lme/acharya/mvvm/ui/topheadline/TopHeadlineActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lme/acharya/mvvm/ui/topheadline/TopHeadlineAdapter;", "getAdapter", "()Lme/acharya/mvvm/ui/topheadline/TopHeadlineAdapter;", "setAdapter", "(Lme/acharya/mvvm/ui/topheadline/TopHeadlineAdapter;)V", "binding", "Lme/acharya/mvvm/databinding/ActivityTopHeadlineBinding;", "topHeadlineViewModel", "Lme/acharya/mvvm/ui/topheadline/TopHeadlineViewModel;", "getTopHeadlineViewModel", "()Lme/acharya/mvvm/ui/topheadline/TopHeadlineViewModel;", "setTopHeadlineViewModel", "(Lme/acharya/mvvm/ui/topheadline/TopHeadlineViewModel;)V", "injectDependencies", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "renderList", "articleList", "", "Lcom/unik/acharyaprashant/data/model/ImageElement;", "setupObserver", "setupUI", "app_debug"})
public final class TopHeadlineActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject
    public me.acharya.mvvm.ui.topheadline.TopHeadlineViewModel topHeadlineViewModel;
    @javax.inject.Inject
    public me.acharya.mvvm.ui.topheadline.TopHeadlineAdapter adapter;
    private me.acharya.mvvm.databinding.ActivityTopHeadlineBinding binding;
    
    public TopHeadlineActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.acharya.mvvm.ui.topheadline.TopHeadlineViewModel getTopHeadlineViewModel() {
        return null;
    }
    
    public final void setTopHeadlineViewModel(@org.jetbrains.annotations.NotNull
    me.acharya.mvvm.ui.topheadline.TopHeadlineViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.acharya.mvvm.ui.topheadline.TopHeadlineAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    me.acharya.mvvm.ui.topheadline.TopHeadlineAdapter p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    private final void setupObserver() {
    }
    
    private final void renderList(java.util.List<com.unik.acharyaprashant.data.model.ImageElement> articleList) {
    }
    
    private final void injectDependencies() {
    }
}
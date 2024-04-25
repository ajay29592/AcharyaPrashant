package me.acharya.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lme/acharya/mvvm/MVVMApplication;", "Landroid/app/Application;", "()V", "applicationComponent", "Lme/acharya/mvvm/di/component/ApplicationComponent;", "getApplicationComponent", "()Lme/acharya/mvvm/di/component/ApplicationComponent;", "setApplicationComponent", "(Lme/acharya/mvvm/di/component/ApplicationComponent;)V", "injectDependencies", "", "onCreate", "app_debug"})
public final class MVVMApplication extends android.app.Application {
    public me.acharya.mvvm.di.component.ApplicationComponent applicationComponent;
    
    public MVVMApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.acharya.mvvm.di.component.ApplicationComponent getApplicationComponent() {
        return null;
    }
    
    public final void setApplicationComponent(@org.jetbrains.annotations.NotNull
    me.acharya.mvvm.di.component.ApplicationComponent p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    private final void injectDependencies() {
    }
}
package me.acharya.mvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lme/acharya/mvvm/utils/AppConstant;", "", "()V", "API_KEY", "", "COUNTRY", "LIMIT", "Key", "Language", "app_debug"})
public final class AppConstant {
    @org.jetbrains.annotations.NotNull
    public static final me.acharya.mvvm.utils.AppConstant INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_KEY = "9f6482a584804376874b848980b7a044";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String COUNTRY = "us";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LIMIT = "100";
    
    private AppConstant() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lme/acharya/mvvm/utils/AppConstant$Language;", "", "(Ljava/lang/String;I)V", "English", "Hindi", "app_debug"})
    public static enum Language {
        /*public static final*/ English /* = new English() */,
        /*public static final*/ Hindi /* = new Hindi() */;
        
        Language() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"Lme/acharya/mvvm/utils/AppConstant$Key;", "", "(Ljava/lang/String;I)V", "ImageJpg", "app_debug"})
    public static enum Key {
        /*public static final*/ ImageJpg /* = new ImageJpg() */;
        
        Key() {
        }
    }
}
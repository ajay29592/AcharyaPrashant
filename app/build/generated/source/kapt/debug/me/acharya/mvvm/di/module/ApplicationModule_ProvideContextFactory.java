// Generated by Dagger (https://dagger.dev).
package me.acharya.mvvm.di.module;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("me.acharya.mvvm.di.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideContextFactory implements Factory<Context> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideContextFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext(module);
  }

  public static ApplicationModule_ProvideContextFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideContextFactory(module);
  }

  public static Context provideContext(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext());
  }
}

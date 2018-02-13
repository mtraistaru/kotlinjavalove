package com.ancestor.kotlinJavaLove.module;

import android.content.Context;
import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebserviceModule_ProvideKotlinJavaLoveServiceFactory
    implements Factory<KotlinJavaLoveService> {
  private final WebserviceModule module;

  private final Provider<Context> contextProvider;

  public WebserviceModule_ProvideKotlinJavaLoveServiceFactory(
      WebserviceModule module, Provider<Context> contextProvider) {
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public KotlinJavaLoveService get() {
    return Preconditions.checkNotNull(
        module.provideKotlinJavaLoveService(contextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<KotlinJavaLoveService> create(
      WebserviceModule module, Provider<Context> contextProvider) {
    return new WebserviceModule_ProvideKotlinJavaLoveServiceFactory(module, contextProvider);
  }

  /** Proxies {@link WebserviceModule#provideKotlinJavaLoveService(Context)}. */
  public static KotlinJavaLoveService proxyProvideKotlinJavaLoveService(
      WebserviceModule instance, Context context) {
    return instance.provideKotlinJavaLoveService(context);
  }
}

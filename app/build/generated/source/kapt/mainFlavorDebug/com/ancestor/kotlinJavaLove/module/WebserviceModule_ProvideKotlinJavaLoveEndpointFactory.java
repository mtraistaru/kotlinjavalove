package com.ancestor.kotlinJavaLove.module;

import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveEndpoint;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.RestAdapter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebserviceModule_ProvideKotlinJavaLoveEndpointFactory
    implements Factory<KotlinJavaLoveEndpoint> {
  private final WebserviceModule module;

  private final Provider<RestAdapter> restAdapterProvider;

  public WebserviceModule_ProvideKotlinJavaLoveEndpointFactory(
      WebserviceModule module, Provider<RestAdapter> restAdapterProvider) {
    assert module != null;
    this.module = module;
    assert restAdapterProvider != null;
    this.restAdapterProvider = restAdapterProvider;
  }

  @Override
  public KotlinJavaLoveEndpoint get() {
    return Preconditions.checkNotNull(
        module.provideKotlinJavaLoveEndpoint(restAdapterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<KotlinJavaLoveEndpoint> create(
      WebserviceModule module, Provider<RestAdapter> restAdapterProvider) {
    return new WebserviceModule_ProvideKotlinJavaLoveEndpointFactory(module, restAdapterProvider);
  }

  /** Proxies {@link WebserviceModule#provideKotlinJavaLoveEndpoint(RestAdapter)}. */
  public static KotlinJavaLoveEndpoint proxyProvideKotlinJavaLoveEndpoint(
      WebserviceModule instance, RestAdapter restAdapter) {
    return instance.provideKotlinJavaLoveEndpoint(restAdapter);
  }
}

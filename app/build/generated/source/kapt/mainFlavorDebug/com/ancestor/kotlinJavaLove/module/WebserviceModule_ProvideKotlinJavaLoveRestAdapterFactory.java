package com.ancestor.kotlinJavaLove.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebserviceModule_ProvideKotlinJavaLoveRestAdapterFactory
    implements Factory<RestAdapter> {
  private final WebserviceModule module;

  private final Provider<OkClient> clientProvider;

  private final Provider<RequestInterceptor> requestInterceptorProvider;

  private final Provider<Gson> gsonProvider;

  public WebserviceModule_ProvideKotlinJavaLoveRestAdapterFactory(
      WebserviceModule module,
      Provider<OkClient> clientProvider,
      Provider<RequestInterceptor> requestInterceptorProvider,
      Provider<Gson> gsonProvider) {
    assert module != null;
    this.module = module;
    assert clientProvider != null;
    this.clientProvider = clientProvider;
    assert requestInterceptorProvider != null;
    this.requestInterceptorProvider = requestInterceptorProvider;
    assert gsonProvider != null;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public RestAdapter get() {
    return Preconditions.checkNotNull(
        module.provideKotlinJavaLoveRestAdapter(
            clientProvider.get(), requestInterceptorProvider.get(), gsonProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RestAdapter> create(
      WebserviceModule module,
      Provider<OkClient> clientProvider,
      Provider<RequestInterceptor> requestInterceptorProvider,
      Provider<Gson> gsonProvider) {
    return new WebserviceModule_ProvideKotlinJavaLoveRestAdapterFactory(
        module, clientProvider, requestInterceptorProvider, gsonProvider);
  }

  /**
   * Proxies {@link WebserviceModule#provideKotlinJavaLoveRestAdapter(OkClient, RequestInterceptor,
   * Gson)}.
   */
  public static RestAdapter proxyProvideKotlinJavaLoveRestAdapter(
      WebserviceModule instance,
      OkClient client,
      RequestInterceptor requestInterceptor,
      Gson gson) {
    return instance.provideKotlinJavaLoveRestAdapter(client, requestInterceptor, gson);
  }
}

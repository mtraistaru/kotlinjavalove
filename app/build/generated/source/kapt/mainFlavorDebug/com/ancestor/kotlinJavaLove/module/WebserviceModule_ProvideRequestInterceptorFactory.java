package com.ancestor.kotlinJavaLove.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit.RequestInterceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebserviceModule_ProvideRequestInterceptorFactory
    implements Factory<RequestInterceptor> {
  private final WebserviceModule module;

  public WebserviceModule_ProvideRequestInterceptorFactory(WebserviceModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RequestInterceptor get() {
    return Preconditions.checkNotNull(
        module.provideRequestInterceptor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RequestInterceptor> create(WebserviceModule module) {
    return new WebserviceModule_ProvideRequestInterceptorFactory(module);
  }

  /** Proxies {@link WebserviceModule#provideRequestInterceptor()}. */
  public static RequestInterceptor proxyProvideRequestInterceptor(WebserviceModule instance) {
    return instance.provideRequestInterceptor();
  }
}

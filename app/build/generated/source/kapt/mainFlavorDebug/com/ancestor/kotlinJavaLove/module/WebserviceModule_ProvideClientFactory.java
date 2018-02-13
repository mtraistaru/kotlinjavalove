package com.ancestor.kotlinJavaLove.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit.client.OkClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebserviceModule_ProvideClientFactory implements Factory<OkClient> {
  private final WebserviceModule module;

  public WebserviceModule_ProvideClientFactory(WebserviceModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OkClient get() {
    return Preconditions.checkNotNull(
        module.provideClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkClient> create(WebserviceModule module) {
    return new WebserviceModule_ProvideClientFactory(module);
  }

  /** Proxies {@link WebserviceModule#provideClient()}. */
  public static OkClient proxyProvideClient(WebserviceModule instance) {
    return instance.provideClient();
  }
}

package com.ancestor.kotlinJavaLove.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebserviceModule_ProvideGsonFactory implements Factory<Gson> {
  private final WebserviceModule module;

  public WebserviceModule_ProvideGsonFactory(WebserviceModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Gson get() {
    return Preconditions.checkNotNull(
        module.provideGson(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Gson> create(WebserviceModule module) {
    return new WebserviceModule_ProvideGsonFactory(module);
  }

  /** Proxies {@link WebserviceModule#provideGson()}. */
  public static Gson proxyProvideGson(WebserviceModule instance) {
    return instance.provideGson();
  }
}

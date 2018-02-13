package com.ancestor.kotlinJavaLove.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CommonModule_ProvideContextFactory implements Factory<Context> {
  private final CommonModule module;

  public CommonModule_ProvideContextFactory(CommonModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(CommonModule module) {
    return new CommonModule_ProvideContextFactory(module);
  }

  /** Proxies {@link CommonModule#provideContext()}. */
  public static Context proxyProvideContext(CommonModule instance) {
    return instance.provideContext();
  }
}

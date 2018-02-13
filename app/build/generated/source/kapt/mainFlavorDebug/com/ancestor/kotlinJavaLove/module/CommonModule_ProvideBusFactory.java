package com.ancestor.kotlinJavaLove.module;

import com.squareup.otto.Bus;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CommonModule_ProvideBusFactory implements Factory<Bus> {
  private final CommonModule module;

  public CommonModule_ProvideBusFactory(CommonModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Bus get() {
    return Preconditions.checkNotNull(
        module.provideBus(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Bus> create(CommonModule module) {
    return new CommonModule_ProvideBusFactory(module);
  }

  /** Proxies {@link CommonModule#provideBus()}. */
  public static Bus proxyProvideBus(CommonModule instance) {
    return instance.provideBus();
  }
}

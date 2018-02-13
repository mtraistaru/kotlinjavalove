package com.ancestor.kotlinJavaLove.weather;

import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveService;
import com.squareup.otto.Bus;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WeatherModule_ProvideWeatherModelFactory
    implements Factory<WeatherContract.Model> {
  private final WeatherModule module;

  private final Provider<KotlinJavaLoveService> kotlinJavaLoveServiceProvider;

  private final Provider<Bus> busProvider;

  public WeatherModule_ProvideWeatherModelFactory(
      WeatherModule module,
      Provider<KotlinJavaLoveService> kotlinJavaLoveServiceProvider,
      Provider<Bus> busProvider) {
    assert module != null;
    this.module = module;
    assert kotlinJavaLoveServiceProvider != null;
    this.kotlinJavaLoveServiceProvider = kotlinJavaLoveServiceProvider;
    assert busProvider != null;
    this.busProvider = busProvider;
  }

  @Override
  public WeatherContract.Model get() {
    return Preconditions.checkNotNull(
        module.provideWeatherModel(kotlinJavaLoveServiceProvider.get(), busProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<WeatherContract.Model> create(
      WeatherModule module,
      Provider<KotlinJavaLoveService> kotlinJavaLoveServiceProvider,
      Provider<Bus> busProvider) {
    return new WeatherModule_ProvideWeatherModelFactory(
        module, kotlinJavaLoveServiceProvider, busProvider);
  }

  /** Proxies {@link WeatherModule#provideWeatherModel(KotlinJavaLoveService, Bus)}. */
  public static WeatherContract.Model proxyProvideWeatherModel(
      WeatherModule instance, KotlinJavaLoveService kotlinJavaLoveService, Bus bus) {
    return instance.provideWeatherModel(kotlinJavaLoveService, bus);
  }
}

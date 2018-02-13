package com.ancestor.kotlinJavaLove.weather;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WeatherModule_ProvideWeatherPresenterFactory
    implements Factory<WeatherContract.Presenter> {
  private final WeatherModule module;

  private final Provider<WeatherContract.Model> modelProvider;

  public WeatherModule_ProvideWeatherPresenterFactory(
      WeatherModule module, Provider<WeatherContract.Model> modelProvider) {
    assert module != null;
    this.module = module;
    assert modelProvider != null;
    this.modelProvider = modelProvider;
  }

  @Override
  public WeatherContract.Presenter get() {
    return Preconditions.checkNotNull(
        module.provideWeatherPresenter(modelProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<WeatherContract.Presenter> create(
      WeatherModule module, Provider<WeatherContract.Model> modelProvider) {
    return new WeatherModule_ProvideWeatherPresenterFactory(module, modelProvider);
  }

  /** Proxies {@link WeatherModule#provideWeatherPresenter(WeatherContract.Model)}. */
  public static WeatherContract.Presenter proxyProvideWeatherPresenter(
      WeatherModule instance, WeatherContract.Model model) {
    return instance.provideWeatherPresenter(model);
  }
}

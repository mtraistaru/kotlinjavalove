package com.ancestor.kotlinJavaLove.weather;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WeatherActivity_MembersInjector implements MembersInjector<WeatherActivity> {
  private final Provider<WeatherContract.Presenter> presenterProvider;

  public WeatherActivity_MembersInjector(Provider<WeatherContract.Presenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<WeatherActivity> create(
      Provider<WeatherContract.Presenter> presenterProvider) {
    return new WeatherActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(WeatherActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }
}

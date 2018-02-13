package com.ancestor.kotlinJavaLove.weather;

import com.ancestor.kotlinJavaLove.KotlinJavaLoveComponent;
import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveService;
import com.squareup.otto.Bus;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerWeatherComponent implements WeatherComponent {
  private Provider<KotlinJavaLoveService> getSpineMonitorServiceProvider;

  private Provider<Bus> getBusProvider;

  private Provider<WeatherContract.Model> provideWeatherModelProvider;

  private Provider<WeatherContract.Presenter> provideWeatherPresenterProvider;

  private MembersInjector<WeatherActivity> weatherActivityMembersInjector;

  private DaggerWeatherComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getSpineMonitorServiceProvider =
        new com_ancestor_kotlinJavaLove_KotlinJavaLoveComponent_getSpineMonitorService(
            builder.kotlinJavaLoveComponent);

    this.getBusProvider =
        new com_ancestor_kotlinJavaLove_KotlinJavaLoveComponent_getBus(
            builder.kotlinJavaLoveComponent);

    this.provideWeatherModelProvider =
        DoubleCheck.provider(
            WeatherModule_ProvideWeatherModelFactory.create(
                builder.weatherModule, getSpineMonitorServiceProvider, getBusProvider));

    this.provideWeatherPresenterProvider =
        DoubleCheck.provider(
            WeatherModule_ProvideWeatherPresenterFactory.create(
                builder.weatherModule, provideWeatherModelProvider));

    this.weatherActivityMembersInjector =
        WeatherActivity_MembersInjector.create(provideWeatherPresenterProvider);
  }

  @Override
  public void inject(WeatherActivity weatherActivity) {
    weatherActivityMembersInjector.injectMembers(weatherActivity);
  }

  public static final class Builder {
    private WeatherModule weatherModule;

    private KotlinJavaLoveComponent kotlinJavaLoveComponent;

    private Builder() {}

    public WeatherComponent build() {
      if (weatherModule == null) {
        throw new IllegalStateException(WeatherModule.class.getCanonicalName() + " must be set");
      }
      if (kotlinJavaLoveComponent == null) {
        throw new IllegalStateException(
            KotlinJavaLoveComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerWeatherComponent(this);
    }

    public Builder weatherModule(WeatherModule weatherModule) {
      this.weatherModule = Preconditions.checkNotNull(weatherModule);
      return this;
    }

    public Builder kotlinJavaLoveComponent(KotlinJavaLoveComponent kotlinJavaLoveComponent) {
      this.kotlinJavaLoveComponent = Preconditions.checkNotNull(kotlinJavaLoveComponent);
      return this;
    }
  }

  private static class com_ancestor_kotlinJavaLove_KotlinJavaLoveComponent_getSpineMonitorService
      implements Provider<KotlinJavaLoveService> {
    private final KotlinJavaLoveComponent kotlinJavaLoveComponent;

    com_ancestor_kotlinJavaLove_KotlinJavaLoveComponent_getSpineMonitorService(
        KotlinJavaLoveComponent kotlinJavaLoveComponent) {
      this.kotlinJavaLoveComponent = kotlinJavaLoveComponent;
    }

    @Override
    public KotlinJavaLoveService get() {
      return Preconditions.checkNotNull(
          kotlinJavaLoveComponent.getSpineMonitorService(),
          "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_ancestor_kotlinJavaLove_KotlinJavaLoveComponent_getBus
      implements Provider<Bus> {
    private final KotlinJavaLoveComponent kotlinJavaLoveComponent;

    com_ancestor_kotlinJavaLove_KotlinJavaLoveComponent_getBus(
        KotlinJavaLoveComponent kotlinJavaLoveComponent) {
      this.kotlinJavaLoveComponent = kotlinJavaLoveComponent;
    }

    @Override
    public Bus get() {
      return Preconditions.checkNotNull(
          kotlinJavaLoveComponent.getBus(),
          "Cannot return null from a non-@Nullable component method");
    }
  }
}

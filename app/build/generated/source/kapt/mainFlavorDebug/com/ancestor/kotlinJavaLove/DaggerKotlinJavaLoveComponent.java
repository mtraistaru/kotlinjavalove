package com.ancestor.kotlinJavaLove;

import android.content.Context;
import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveEndpoint;
import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveService;
import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveService_MembersInjector;
import com.ancestor.kotlinJavaLove.module.CommonModule;
import com.ancestor.kotlinJavaLove.module.CommonModule_ProvideBusFactory;
import com.ancestor.kotlinJavaLove.module.CommonModule_ProvideContextFactory;
import com.ancestor.kotlinJavaLove.module.WebserviceModule;
import com.ancestor.kotlinJavaLove.module.WebserviceModule_ProvideClientFactory;
import com.ancestor.kotlinJavaLove.module.WebserviceModule_ProvideGsonFactory;
import com.ancestor.kotlinJavaLove.module.WebserviceModule_ProvideKotlinJavaLoveEndpointFactory;
import com.ancestor.kotlinJavaLove.module.WebserviceModule_ProvideKotlinJavaLoveRestAdapterFactory;
import com.ancestor.kotlinJavaLove.module.WebserviceModule_ProvideKotlinJavaLoveServiceFactory;
import com.ancestor.kotlinJavaLove.module.WebserviceModule_ProvideRequestInterceptorFactory;
import com.google.gson.Gson;
import com.squareup.otto.Bus;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
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
public final class DaggerKotlinJavaLoveComponent implements KotlinJavaLoveComponent {
  private Provider<Context> provideContextProvider;

  private Provider<KotlinJavaLoveService> provideKotlinJavaLoveServiceProvider;

  private Provider<Bus> provideBusProvider;

  private Provider<OkClient> provideClientProvider;

  private Provider<RequestInterceptor> provideRequestInterceptorProvider;

  private Provider<Gson> provideGsonProvider;

  private Provider<RestAdapter> provideKotlinJavaLoveRestAdapterProvider;

  private Provider<KotlinJavaLoveEndpoint> provideKotlinJavaLoveEndpointProvider;

  private MembersInjector<KotlinJavaLoveService> kotlinJavaLoveServiceMembersInjector;

  private DaggerKotlinJavaLoveComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideContextProvider =
        DoubleCheck.provider(CommonModule_ProvideContextFactory.create(builder.commonModule));

    this.provideKotlinJavaLoveServiceProvider =
        DoubleCheck.provider(
            WebserviceModule_ProvideKotlinJavaLoveServiceFactory.create(
                builder.webserviceModule, provideContextProvider));

    this.provideBusProvider =
        DoubleCheck.provider(CommonModule_ProvideBusFactory.create(builder.commonModule));

    this.provideClientProvider =
        DoubleCheck.provider(
            WebserviceModule_ProvideClientFactory.create(builder.webserviceModule));

    this.provideRequestInterceptorProvider =
        DoubleCheck.provider(
            WebserviceModule_ProvideRequestInterceptorFactory.create(builder.webserviceModule));

    this.provideGsonProvider =
        DoubleCheck.provider(WebserviceModule_ProvideGsonFactory.create(builder.webserviceModule));

    this.provideKotlinJavaLoveRestAdapterProvider =
        DoubleCheck.provider(
            WebserviceModule_ProvideKotlinJavaLoveRestAdapterFactory.create(
                builder.webserviceModule,
                provideClientProvider,
                provideRequestInterceptorProvider,
                provideGsonProvider));

    this.provideKotlinJavaLoveEndpointProvider =
        DoubleCheck.provider(
            WebserviceModule_ProvideKotlinJavaLoveEndpointFactory.create(
                builder.webserviceModule, provideKotlinJavaLoveRestAdapterProvider));

    this.kotlinJavaLoveServiceMembersInjector =
        KotlinJavaLoveService_MembersInjector.create(
            provideKotlinJavaLoveEndpointProvider, provideBusProvider);
  }

  @Override
  public KotlinJavaLoveService getSpineMonitorService() {
    return provideKotlinJavaLoveServiceProvider.get();
  }

  @Override
  public Bus getBus() {
    return provideBusProvider.get();
  }

  @Override
  public void inject(KotlinJavaLoveService kotlinJavaLoveService) {
    kotlinJavaLoveServiceMembersInjector.injectMembers(kotlinJavaLoveService);
  }

  public static final class Builder {
    private CommonModule commonModule;

    private WebserviceModule webserviceModule;

    private Builder() {}

    public KotlinJavaLoveComponent build() {
      if (commonModule == null) {
        throw new IllegalStateException(CommonModule.class.getCanonicalName() + " must be set");
      }
      if (webserviceModule == null) {
        this.webserviceModule = new WebserviceModule();
      }
      return new DaggerKotlinJavaLoveComponent(this);
    }

    public Builder commonModule(CommonModule commonModule) {
      this.commonModule = Preconditions.checkNotNull(commonModule);
      return this;
    }

    public Builder webserviceModule(WebserviceModule webserviceModule) {
      this.webserviceModule = Preconditions.checkNotNull(webserviceModule);
      return this;
    }
  }
}

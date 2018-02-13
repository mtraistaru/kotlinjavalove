package com.ancestor.kotlinJavaLove.api;

import com.squareup.otto.Bus;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class KotlinJavaLoveService_MembersInjector
    implements MembersInjector<KotlinJavaLoveService> {
  private final Provider<KotlinJavaLoveEndpoint> kotlinJavaLoveEndpointProvider;

  private final Provider<Bus> busProvider;

  public KotlinJavaLoveService_MembersInjector(
      Provider<KotlinJavaLoveEndpoint> kotlinJavaLoveEndpointProvider, Provider<Bus> busProvider) {
    assert kotlinJavaLoveEndpointProvider != null;
    this.kotlinJavaLoveEndpointProvider = kotlinJavaLoveEndpointProvider;
    assert busProvider != null;
    this.busProvider = busProvider;
  }

  public static MembersInjector<KotlinJavaLoveService> create(
      Provider<KotlinJavaLoveEndpoint> kotlinJavaLoveEndpointProvider, Provider<Bus> busProvider) {
    return new KotlinJavaLoveService_MembersInjector(kotlinJavaLoveEndpointProvider, busProvider);
  }

  @Override
  public void injectMembers(KotlinJavaLoveService instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.kotlinJavaLoveEndpoint = kotlinJavaLoveEndpointProvider.get();
    instance.bus = busProvider.get();
  }

  public static void injectKotlinJavaLoveEndpoint(
      KotlinJavaLoveService instance,
      Provider<KotlinJavaLoveEndpoint> kotlinJavaLoveEndpointProvider) {
    instance.kotlinJavaLoveEndpoint = kotlinJavaLoveEndpointProvider.get();
  }

  public static void injectBus(KotlinJavaLoveService instance, Provider<Bus> busProvider) {
    instance.bus = busProvider.get();
  }
}

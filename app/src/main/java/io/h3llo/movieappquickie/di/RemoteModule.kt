package io.h3llo.movieappquickie.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.h3llo.movieappquickie.BuildConfig

import io.h3llo.movieappquickie.data.networking.service.MethodApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RemoteModule {

    @Provides
    @Singleton
    fun provideRetrofit() : MethodApi = Retrofit.Builder()
        .baseUrl(BuildConfig.URL_BASE)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create()

}
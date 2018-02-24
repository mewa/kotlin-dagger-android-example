package io.mewa.kt.dagger.android.example.di

import dagger.Module
import dagger.Provides
import io.mewa.kt.dagger.android.example.api.Api

@Module
class ApiModule {

    @Provides
    fun provideApi(): Api {
        return Api()
    }

}
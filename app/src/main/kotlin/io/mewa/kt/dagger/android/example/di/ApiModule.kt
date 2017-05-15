package io.mewa.kt.dagger.android.example.di

import io.mewa.kt.dagger.android.example.api.Api
import dagger.Module
import dagger.Provides

/**
 * Created by Mewa on 2017-05-15.
 */

@Module class ApiModule {
    @Provides fun provideApi(): Api {
        return Api()
    }
}
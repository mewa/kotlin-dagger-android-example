package io.mewa.kt.dagger.android.example.di

import io.mewa.kt.dagger.android.example.App
import dagger.Component
import dagger.android.AndroidInjectionModule
import io.mewa.kt.dagger.android.example.di.ActivitiesModule
import io.mewa.kt.dagger.android.example.di.ApiModule

/**
 * Created by Mewa on 2017-05-15.
 */

@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        ApiModule::class,
        ActivitiesModule::class
)) interface AppComponent {
    fun inject(app: App)
}
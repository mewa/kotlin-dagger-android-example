package io.mewa.kt.dagger.android.example.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.mewa.kt.dagger.android.example.ui.MainActivity
import io.mewa.kt.dagger.android.example.ui.OtherActivity

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivityInjector(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeOtherActivityInjector(): OtherActivity
}
package io.mewa.kt.dagger.android.example.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.mewa.kt.dagger.android.example.ui.MainActivity
import io.mewa.kt.dagger.android.example.ui.OtherActivity

@Module
abstract class ActivitiesModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeMainActivityInjector(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeOtherActivityInjector(): OtherActivity
}
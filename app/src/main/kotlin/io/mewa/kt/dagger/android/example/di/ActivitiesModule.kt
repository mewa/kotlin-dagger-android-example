package io.mewa.kt.dagger.android.example.di

import io.mewa.kt.dagger.android.example.MainActivity
import io.mewa.kt.dagger.android.example.OtherActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton


/**
 * Created by Mewa on 2017-05-15.
 */

@Module
abstract class ActivitiesModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeMainActivityInjector(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeOtherActivityInjector(): OtherActivity
}
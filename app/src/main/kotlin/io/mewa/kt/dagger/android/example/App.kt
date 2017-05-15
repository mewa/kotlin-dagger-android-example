package io.mewa.kt.dagger.android.example

import android.app.Activity
import android.app.Application
import io.mewa.kt.dagger.android.example.api.Api
import io.mewa.kt.dagger.android.example.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by Mewa on 2017-05-15.
 */

class App : Application(), HasActivityInjector {
    @Inject lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }

    @Inject lateinit var api: Api

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.create()
                .inject(this)
    }
}
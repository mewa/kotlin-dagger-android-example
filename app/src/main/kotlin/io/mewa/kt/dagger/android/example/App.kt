package io.mewa.kt.dagger.android.example

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.mewa.kt.dagger.android.example.di.DaggerAppComponent

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

}
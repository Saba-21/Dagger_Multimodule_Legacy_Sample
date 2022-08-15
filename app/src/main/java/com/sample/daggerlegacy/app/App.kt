package com.sample.daggerlegacy.app

import android.app.Application
import com.sample.daggerlegacy.app.di.AppComponent
import com.sample.daggerlegacy.app.di.DaggerAppComponent

class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent
            .factory()
            .create(this)
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }

}
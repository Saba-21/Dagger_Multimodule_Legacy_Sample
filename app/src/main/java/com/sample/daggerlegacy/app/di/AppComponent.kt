package com.sample.daggerlegacy.app.di

import android.app.Application
import com.sample.daggerlegacy.activity.di.ActivityComponent
import com.sample.daggerlegacy.app.App
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): AppComponent
    }

    fun inject(app: App)

    fun getActivityComponentFactory(): ActivityComponent.Factory

}

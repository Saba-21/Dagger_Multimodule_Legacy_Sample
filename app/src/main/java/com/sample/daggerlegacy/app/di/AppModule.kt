package com.sample.daggerlegacy.app.di

import com.sample.base.other.AppFeature
import com.sample.daggerlegacy.app.feature.AppFeatureImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideAppDependency(): AppFeature = AppFeatureImpl()

}

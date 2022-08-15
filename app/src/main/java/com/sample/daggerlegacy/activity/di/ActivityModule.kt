package com.sample.daggerlegacy.activity.di

import com.sample.base.other.ActivityFeature
import com.sample.base.other.ActivityScope
import com.sample.daggerlegacy.activity.feature.ActivityFeatureImpl
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    @ActivityScope
    fun provideActivityDependency(): ActivityFeature {
        return ActivityFeatureImpl()
    }

}

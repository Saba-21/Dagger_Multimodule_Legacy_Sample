package com.sample.daggerlegacy.activity.di

import com.sample.base.other.ActivityFeature
import com.sample.base.other.ActivityScope
import com.sample.base.other.AppFeature
import com.sample.base.other.OneFeature
import com.sample.featureone.fragment.di.OneFeatureApi
import com.sample.featureone.fragment.di.OneFeatureDependencies
import com.sample.featuretwo.fragment.di.TwoFeatureDependencies
import dagger.Module
import dagger.Provides

@Module
class FeatureDependenciesModule {

    @Provides
    @ActivityScope
    fun provideOneFeatureDependencies(
        appFeature: AppFeature,
        activityFeature: ActivityFeature
    ): OneFeatureDependencies {
        return object : OneFeatureDependencies {
            override fun provideAppDependency(): AppFeature = appFeature
            override fun provideActivityDependency(): ActivityFeature = activityFeature
        }
    }

    @Provides
    @ActivityScope
    fun provideTwoFeatureApiDependencies(
        oneFeature: OneFeatureApi,
        appFeature: AppFeature,
        activityFeature: ActivityFeature
    ): TwoFeatureDependencies {
        return object : TwoFeatureDependencies {
            override fun provideFragmentDependency(): OneFeature =
                oneFeature.provideFragmentDependency()

            override fun provideAppDependency(): AppFeature = appFeature
            override fun provideActivityDependency(): ActivityFeature = activityFeature
        }
    }

}
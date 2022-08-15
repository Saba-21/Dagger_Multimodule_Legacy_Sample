package com.sample.daggerlegacy.activity.di

import com.sample.base.other.ActivityScope
import com.sample.featureone.fragment.di.OneFeatureApi
import com.sample.featureone.fragment.di.OneFeatureDependencies
import com.sample.featureone.fragment.di.OneFragmentComponent
import com.sample.featuretwo.fragment.di.TwoFeatureApi
import com.sample.featuretwo.fragment.di.TwoFeatureDependencies
import com.sample.featuretwo.fragment.di.TwoFragmentComponent
import dagger.Module
import dagger.Provides

@Module
class FeatureModule {

    @Provides
    @ActivityScope
    fun provideOneFeatureApi(dependencies: OneFeatureDependencies): OneFeatureApi {
        return OneFragmentComponent.initAndGet(dependencies)
    }

    @Provides
    @ActivityScope
    fun provideTwoFeatureApi(dependencies: TwoFeatureDependencies): TwoFeatureApi {
        return TwoFragmentComponent.initAndGet(dependencies)
    }

}
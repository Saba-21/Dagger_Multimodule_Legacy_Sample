package com.sample.featuretwo.fragment.di

import com.sample.base.other.FragmentScope
import com.sample.base.other.TwoFeature
import com.sample.featuretwo.fragment.feature.TwoFeatureImpl
import dagger.Module
import dagger.Provides

@Module
class TwoFragmentModule {

    @Provides
    @FragmentScope
    fun provideFragmentDependency(): TwoFeature = TwoFeatureImpl()

}

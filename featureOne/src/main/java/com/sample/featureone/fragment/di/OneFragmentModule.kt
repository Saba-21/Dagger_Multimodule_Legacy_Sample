package com.sample.featureone.fragment.di

import com.sample.base.other.FragmentScope
import com.sample.base.other.OneFeature
import com.sample.featureone.fragment.feature.OneFeatureImpl
import dagger.Module
import dagger.Provides

@Module
class OneFragmentModule {

    @Provides
    @FragmentScope
    fun provideFragmentDependency(): OneFeature = OneFeatureImpl()

}

package com.sample.featuretwo.fragment.di

import com.sample.base.other.ActivityFeature
import com.sample.base.other.AppFeature
import com.sample.base.other.OneFeature

interface TwoFeatureDependencies {

    fun provideFragmentDependency(): OneFeature

    fun provideAppDependency(): AppFeature

    fun provideActivityDependency(): ActivityFeature
}
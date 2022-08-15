package com.sample.featureone.fragment.di

import com.sample.base.other.ActivityFeature
import com.sample.base.other.AppFeature

interface OneFeatureDependencies {

    fun provideAppDependency(): AppFeature

    fun provideActivityDependency(): ActivityFeature

}
package com.sample.featureone.fragment.di

import com.sample.base.other.FragmentScope
import com.sample.base.other.SingletonHolder
import com.sample.featureone.fragment.OneFragment
import dagger.Component

@Component(modules = [OneFragmentModule::class], dependencies = [OneFeatureDependencies::class])
@FragmentScope
interface OneFragmentComponent : OneFeatureApi {

    fun inject(fragment: OneFragment)

    companion object :
        SingletonHolder<OneFeatureApi, OneFragmentComponent, OneFeatureDependencies>(::create)

}

fun create(dependencies: OneFeatureDependencies) =
    DaggerOneFragmentComponent
        .builder()
        .oneFeatureDependencies(dependencies)
        .build()


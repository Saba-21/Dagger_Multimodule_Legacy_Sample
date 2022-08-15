package com.sample.featuretwo.fragment.di

import com.sample.base.other.FragmentScope
import com.sample.base.other.SingletonHolder
import com.sample.featuretwo.fragment.TwoFragment
import dagger.Component

@Component(modules = [TwoFragmentModule::class], dependencies = [TwoFeatureDependencies::class])
@FragmentScope
interface TwoFragmentComponent : TwoFeatureApi {

    fun inject(fragment: TwoFragment)

    companion object :
        SingletonHolder<TwoFeatureApi, TwoFragmentComponent, TwoFeatureDependencies>(::create)

}

fun create(dependencies: TwoFeatureDependencies) =
    DaggerTwoFragmentComponent
        .builder()
        .twoFeatureDependencies(dependencies)
        .build()


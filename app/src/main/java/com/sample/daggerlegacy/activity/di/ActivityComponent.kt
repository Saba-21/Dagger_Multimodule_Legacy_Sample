package com.sample.daggerlegacy.activity.di

import com.sample.base.other.ActivityScope
import com.sample.daggerlegacy.activity.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [ActivityModule::class, FeatureDependenciesModule::class, FeatureModule::class])
@ActivityScope
interface ActivityComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance activity: MainActivity): ActivityComponent
    }

    fun inject(activity: MainActivity)

}

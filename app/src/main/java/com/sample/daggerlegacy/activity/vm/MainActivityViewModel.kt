package com.sample.daggerlegacy.activity.vm

import androidx.lifecycle.ViewModel
import com.sample.base.other.ActivityFeature
import com.sample.base.other.AppFeature
import com.sample.featureone.fragment.di.OneFeatureApi
import com.sample.featuretwo.fragment.di.TwoFeatureApi
import javax.inject.Inject

class MainActivityViewModel
@Inject constructor(
    private val appFeature: AppFeature,
    private val activityFeature: ActivityFeature,

    private val oneFeatureApi: OneFeatureApi,
    private val twoFeatureApi: TwoFeatureApi
) : ViewModel() {

    fun test() {
        appFeature.test()
        activityFeature.test()
    }

}
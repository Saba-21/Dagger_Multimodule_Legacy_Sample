package com.sample.featureone.fragment.vm

import androidx.lifecycle.ViewModel
import com.sample.base.other.ActivityFeature
import com.sample.base.other.AppFeature
import com.sample.base.other.OneFeature
import javax.inject.Inject

class OneFragmentViewModel
@Inject constructor(
    private val oneFeature: OneFeature,
    private val appFeature: AppFeature,
    private val activityFeature: ActivityFeature
) : ViewModel() {

    fun test() {
        appFeature.test()
        activityFeature.test()
        oneFeature.test()
    }

}
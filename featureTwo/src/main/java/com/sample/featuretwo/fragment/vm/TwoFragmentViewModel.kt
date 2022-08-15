package com.sample.featuretwo.fragment.vm

import androidx.lifecycle.ViewModel
import com.sample.base.other.ActivityFeature
import com.sample.base.other.AppFeature
import com.sample.base.other.OneFeature
import com.sample.base.other.TwoFeature
import javax.inject.Inject

class TwoFragmentViewModel
@Inject constructor(
    private val oneFeature: OneFeature,
    private val twoFeature: TwoFeature,
    private val appFeature: AppFeature,
    private val activityFeature: ActivityFeature
) : ViewModel() {

    fun test() {
        appFeature.test()
        activityFeature.test()
        oneFeature.test()
        twoFeature.test()
    }

}
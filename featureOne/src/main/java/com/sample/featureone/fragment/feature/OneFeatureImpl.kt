package com.sample.featureone.fragment.feature

import android.util.Log
import com.sample.base.other.OneFeature

class OneFeatureImpl : OneFeature {
    override fun test() {
        Log.e("FeatureOne", this.toString().substringAfter('@'))
    }
}
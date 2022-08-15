package com.sample.featuretwo.fragment.feature

import android.util.Log
import com.sample.base.other.TwoFeature

class TwoFeatureImpl : TwoFeature {
    override fun test() {
        Log.e("FeatureTwo", this.toString().substringAfter('@'))
    }
}
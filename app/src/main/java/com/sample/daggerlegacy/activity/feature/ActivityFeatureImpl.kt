package com.sample.daggerlegacy.activity.feature

import android.util.Log
import com.sample.base.other.ActivityFeature

class ActivityFeatureImpl : ActivityFeature {
    override fun test() {
        Log.e("ActivityFeature", this.toString().substringAfter('@'))
    }
}
package com.sample.daggerlegacy.app.feature

import android.util.Log
import com.sample.base.other.AppFeature

class AppFeatureImpl : AppFeature {
    override fun test() {
        Log.e("AppFeature", this.toString().substringAfter('@'))
    }
}
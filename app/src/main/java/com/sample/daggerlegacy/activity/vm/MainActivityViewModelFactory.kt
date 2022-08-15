package com.sample.daggerlegacy.activity.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.base.other.ActivityScope
import javax.inject.Inject
import javax.inject.Provider

@ActivityScope
class MainActivityViewModelFactory
@Inject constructor(
    private val viewModel: Provider<MainActivityViewModel>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModel.get() as T
    }

}
package com.sample.featuretwo.fragment.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.base.other.FragmentScope
import javax.inject.Inject
import javax.inject.Provider

@FragmentScope
class TwoFragmentViewModelFactory
@Inject constructor(
    private val viewModel: Provider<TwoFragmentViewModel>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModel.get() as T
    }

}
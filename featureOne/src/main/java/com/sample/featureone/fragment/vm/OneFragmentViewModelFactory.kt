package com.sample.featureone.fragment.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.base.other.FragmentScope
import javax.inject.Inject
import javax.inject.Provider

@FragmentScope
class OneFragmentViewModelFactory
@Inject constructor(
    private val viewModel: Provider<OneFragmentViewModel>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModel.get() as T
    }

}
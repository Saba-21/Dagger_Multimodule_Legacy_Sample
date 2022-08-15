package com.sample.featureone.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sample.featureone.R
import com.sample.featureone.fragment.di.OneFragmentComponent
import com.sample.featureone.fragment.vm.OneFragmentViewModel
import com.sample.featureone.fragment.vm.OneFragmentViewModelFactory
import javax.inject.Inject

class OneFragment : Fragment(R.layout.fragment_one) {

    @Inject
    lateinit var viewModelFactory: OneFragmentViewModelFactory

    private val viewModel: OneFragmentViewModel by lazy {
        ViewModelProvider(viewModelStore, viewModelFactory)[OneFragmentViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        OneFragmentComponent.get().inject(this)

        viewModel.test()
    }

}
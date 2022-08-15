package com.sample.featuretwo.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sample.featuretwo.R
import com.sample.featuretwo.fragment.di.TwoFragmentComponent
import com.sample.featuretwo.fragment.vm.TwoFragmentViewModel
import com.sample.featuretwo.fragment.vm.TwoFragmentViewModelFactory
import javax.inject.Inject

class TwoFragment : Fragment(R.layout.fragment_two) {

    @Inject
    lateinit var viewModelFactory: TwoFragmentViewModelFactory

    private val viewModel: TwoFragmentViewModel by lazy {
        ViewModelProvider(viewModelStore, viewModelFactory)[TwoFragmentViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        TwoFragmentComponent.get().inject(this)

        viewModel.test()
    }

}
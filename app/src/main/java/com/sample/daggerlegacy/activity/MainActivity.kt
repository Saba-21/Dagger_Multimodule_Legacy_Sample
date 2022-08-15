package com.sample.daggerlegacy.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.sample.daggerlegacy.R
import com.sample.daggerlegacy.activity.vm.MainActivityViewModel
import com.sample.daggerlegacy.activity.vm.MainActivityViewModelFactory
import com.sample.daggerlegacy.app.App
import com.sample.featureone.fragment.OneFragment
import com.sample.featuretwo.fragment.TwoFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    lateinit var viewModelFactory: MainActivityViewModelFactory

    private val viewModel: MainActivityViewModel by lazy {
        ViewModelProvider(viewModelStore, viewModelFactory)[MainActivityViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val component = (application as App).component
            .getActivityComponentFactory()
            .create(this)

        component.inject(this)
        viewModel.test()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.holderOne, OneFragment())
            commit()
        }
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.holderTwo, TwoFragment())
            commit()
        }

    }

}
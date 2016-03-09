package com.josedlpozo.series.ui.activity

import android.os.Bundle
import com.josedlpozo.series.KotlinApplication
import com.josedlpozo.series.R


/**
 * Created by josedelpozo on 9/3/16.
 */
class DetailActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupActivityComponent()
    }

    override fun setupActivityComponent() {
        KotlinApplication.appComponent.inject(this)
    }

}
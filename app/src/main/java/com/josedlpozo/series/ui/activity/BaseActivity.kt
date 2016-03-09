package com.josedlpozo.series.ui.activity

import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife
import com.josedlpozo.series.R

/**
 * Created by josedelpozo on 4/3/16.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    abstract fun setupActivityComponent()

    fun getTypeFace(): Typeface {
        return Typeface.createFromAsset(assets, getString(R.string.main_typeface))
    }
}
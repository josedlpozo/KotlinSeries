package com.josedlpozo.series.ui.activity

import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife

/**
 * Created by josedelpozo on 4/3/16.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    fun getTypeFace(): Typeface {
        return Typeface.createFromAsset(assets, "monof55.ttf")
    }
}
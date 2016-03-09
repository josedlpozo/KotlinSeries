package com.josedlpozo.series

import android.app.Application
import android.content.Context
import android.support.annotation.VisibleForTesting

/**
 * Created by josedelpozo on 7/3/16.
 */
class KotlinApplication : Application() {


    companion object {
        //platformStatic allow access it from java code
        @JvmStatic lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        //Global dependencies graph is created here
        appComponent = DaggerAppComponent.builder().rootModule(RootModule(this)).build()
        appComponent.inject(this)
    }

}
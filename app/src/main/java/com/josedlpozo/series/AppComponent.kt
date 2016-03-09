package com.josedlpozo.series

import com.josedlpozo.series.ui.activity.DetailActivity
import com.josedlpozo.series.ui.activity.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by josedelpozo on 7/3/16.
 */
@Singleton
@Component(modules = arrayOf(RootModule::class))
interface AppComponent {

    fun inject(application: KotlinApplication)

    fun inject(activity: MainActivity)

    fun inject(activity: DetailActivity)
}
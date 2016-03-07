package com.josedlpozo.series

import dagger.Component
import javax.inject.Singleton

/**
 * Created by josedelpozo on 7/3/16.
 */
@Singleton
@Component(modules = arrayOf(RootModule::class))
interface AppComponent {

}
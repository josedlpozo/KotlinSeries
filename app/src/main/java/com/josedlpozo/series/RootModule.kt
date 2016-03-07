package com.josedlpozo.series

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by josedelpozo on 7/3/16.
 */
@Module
class RootModule(private val application: KotlinApplication) {

    /*@Provides
    @Singleton
    fun provideSeriesRepository(): SeriesRepository {
        return SeriesRepository()
    }*/

    @Provides
    fun provideContext(): Context {
        return application.getApplicationContext()
    }

}


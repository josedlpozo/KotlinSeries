package com.josedlpozo.series

import android.content.Context
import com.josedlpozo.series.repository.SeriesRepository
import com.josedlpozo.series.ui.presenter.SeriesPresenter
import com.josedlpozo.series.usecase.GetSeries
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
    @Singleton
    @ForApplication
    fun provideApplicationContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideSeriesRepository(): SeriesRepository{
        return SeriesRepository()
    }


}


package com.josedlpozo.series.ui.presenter

import android.util.Log
import com.josedlpozo.series.model.Serie
import com.josedlpozo.series.usecase.GetSeries
import java.util.*
import javax.inject.Inject

/**
 * Created by josedelpozo on 8/3/16.
 */
class SeriesPresenter(): Presenter<SeriesPresenter.View>() {

    @Inject
    lateinit var getSeries : GetSeries

    @Inject
    constructor(getSeries: GetSeries) : this() {
        this.getSeries = getSeries
    }

    fun clickSerie(serie: Serie){
        (view as SeriesPresenter.View).onSerieClick(serie)
    }

    override fun initialize(){
        getSeries.getAll(){
            if(it?.size!!.compareTo(0) > 0){
                view?.hideLoading()
                (view as SeriesPresenter.View).showSeries(it)
            }else{

            }
        }
    }

    interface View : Presenter.View{

        fun showSeries(series: ArrayList<Serie>?)

        fun onSerieClick(serie: Serie)
    }
}
package com.josedlpozo.series.ui.presenter

import com.josedlpozo.series.model.Serie
import com.josedlpozo.series.usecase.GetSerieByName
import com.josedlpozo.series.usecase.GetSeries
import java.util.*
import javax.inject.Inject

/**
 * Created by josedelpozo on 9/3/16.
 */
class SerieDetailPresenter(): Presenter<SerieDetailPresenter.View>() {

    @Inject
    lateinit var getSerieByName : GetSerieByName

    var serieName : String? = null

    @Inject
    constructor(getSerieByName: GetSerieByName) : this() {
        this.getSerieByName = getSerieByName
    }

    override fun initialize(){
        getSerieByName.getSerie(serieName!!){
            view?.hideLoading()
            (view as SerieDetailPresenter.View).showSerie(it)
        }
    }

    interface View : Presenter.View{

        fun showSerie(series: Serie)

    }
}
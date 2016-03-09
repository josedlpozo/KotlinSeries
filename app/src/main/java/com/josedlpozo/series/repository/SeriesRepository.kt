package com.josedlpozo.series.repository

import android.util.Log
import com.josedlpozo.series.model.Serie
import org.jetbrains.anko.async
import java.util.*

/**
 * Created by josedelpozo on 8/3/16.
 */
class SeriesRepository{

    var series : ArrayList<Serie>? = null

    constructor(){
        series = ArrayList()
        obtainSeriesFromFakeServer()
    }

    fun obtainSeriesFromFakeServer(){
        series?.add(Serie("Game of thrones","Great Serie!", "http://www.eliberico.com/wp-content/uploads/2015/02/juego-de-tronos.jpg"))

        series?.add(Serie("Game of thrones","Great Serie!", "http://www.eliberico.com/wp-content/uploads/2015/02/juego-de-tronos.jpg"))

        series?.add(Serie("Game of thrones","Great Serie!", "http://www.eliberico.com/wp-content/uploads/2015/02/juego-de-tronos.jpg"))

        series?.add(Serie("Game of thrones","Great Serie!", "http://www.eliberico.com/wp-content/uploads/2015/02/juego-de-tronos.jpg"))
    }

    fun getAll() : ArrayList<Serie>?{
        Log.d("repository", "calling getALL")
        return series
    }

}
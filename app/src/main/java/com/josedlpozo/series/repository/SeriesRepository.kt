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

        series?.add(Serie("Dexter","Great Serie!", "http://static.wixstatic.com/media/9625d4_a90f01cd5cba493daf744a9dce034b7d.jpg"))

        series?.add(Serie("Lost","Great Serie!", "http://vignette4.wikia.nocookie.net/lostpedia/images/a/aa/Lost-season1.png/revision/latest?cb=20061010033648&path-prefix=es"))

        series?.add(Serie("Breaking bad","Great Serie!", "http://nbc.com.co/wp-content/uploads/2015/10/breaking-bad-season6-750x525.png"))
    }

    fun getAll() : ArrayList<Serie>?{
        return series
    }

    fun getByName(name: String) : Serie{
        series?.forEach {
            if(it.name.equals(name)) return it
        }
        return series?.get(0)!!
    }

}
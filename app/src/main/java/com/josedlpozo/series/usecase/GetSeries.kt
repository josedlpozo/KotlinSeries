package com.josedlpozo.series.usecase

import com.josedlpozo.series.model.Serie
import com.josedlpozo.series.repository.SeriesRepository
import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread
import java.util.*
import javax.inject.Inject

/**
 * Created by josedelpozo on 8/3/16.
 */
class GetSeries {

    lateinit var repository: SeriesRepository

    @Inject
    constructor(repository: SeriesRepository){
     this.repository = repository
    }

    fun getAll(callback : (ArrayList<Serie>?) -> Unit) {
        async() {
            var list = repository.getAll()
            uiThread {
                callback(list)
            }
        }

    }
}
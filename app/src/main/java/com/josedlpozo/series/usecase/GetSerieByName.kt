package com.josedlpozo.series.usecase

import com.josedlpozo.series.model.Serie
import com.josedlpozo.series.repository.SeriesRepository
import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread
import java.util.*
import javax.inject.Inject

/**
 * Created by josedelpozo on 9/3/16.
 */
class GetSerieByName {

    lateinit var repository: SeriesRepository

    @Inject
    constructor(repository: SeriesRepository){
        this.repository = repository
    }

    fun getSerie(serieName: String, callback : (Serie) -> Unit) {
        async() {
            var serie = repository.getByName(serieName)
            uiThread {
                callback(serie)
            }
        }

    }
}
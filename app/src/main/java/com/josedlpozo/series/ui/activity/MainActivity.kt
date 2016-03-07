package com.josedlpozo.series.ui.activity

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.josedlpozo.series.R
import com.josedlpozo.series.model.Serie
import com.josedlpozo.series.ui.adapter.SeriesAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import java.util.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        initAdapter()
    }

    fun initRecyclerView(){
        seriesRecyclerView.layoutManager = LinearLayoutManager(this)
        seriesRecyclerView.setHasFixedSize(true)
    }

    fun initAdapter(){
        var series = ArrayList<Serie>()

        series.add(Serie("Game of thrones","Great Serie!", "http://www.eliberico.com/wp-content/uploads/2015/02/juego-de-tronos.jpg"))

        series.add(Serie("Game of thrones","Great Serie!", "http://www.eliberico.com/wp-content/uploads/2015/02/juego-de-tronos.jpg"))

        series.add(Serie("Game of thrones","Great Serie!", "http://www.eliberico.com/wp-content/uploads/2015/02/juego-de-tronos.jpg"))

        series.add(Serie("Game of thrones","Great Serie!", "http://www.eliberico.com/wp-content/uploads/2015/02/juego-de-tronos.jpg"))

        Log.d("series", "" + series.size)

        var seriesAdapter = SeriesAdapter(series) {
            toast(it.name)
        }
        Log.d("adapter", "init adapter")
        seriesRecyclerView.adapter = seriesAdapter
    }
}

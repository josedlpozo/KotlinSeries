package com.josedlpozo.series.ui.activity

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import com.josedlpozo.series.KotlinApplication
import com.josedlpozo.series.R
import com.josedlpozo.series.model.Serie
import com.josedlpozo.series.ui.adapter.SeriesAdapter
import com.josedlpozo.series.ui.presenter.SeriesPresenter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import java.util.*
import javax.inject.Inject

class MainActivity : BaseActivity(), SeriesPresenter.View {

    @Inject
    lateinit var presenter : SeriesPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupActivityComponent()
        initPresenter()
        initRecyclerView()
    }

    override fun setupActivityComponent() {
        KotlinApplication.appComponent.inject(this)
    }

    fun initPresenter(){
        presenter.view = this
        presenter.initialize()
    }

    fun initRecyclerView(){
        seriesRecyclerView.layoutManager = LinearLayoutManager(this)
        seriesRecyclerView.setHasFixedSize(true)
    }

    override fun hideLoading() {
        progress_bar.hide()
    }

    override fun showLoading() {
        progress_bar.show()
    }

    override fun showSeries(series: ArrayList<Serie>?) {
        var seriesAdapter = SeriesAdapter(series!!) {
            presenter.clickSerie(it)
        }
        seriesRecyclerView.adapter = seriesAdapter
    }

    override fun onSerieClick(serie: Serie) {
        Log.d("Serie", "Click "+serie.name)
    }

    override fun showEmptyCase(){
        empty_case.visibility = View.VISIBLE
    }
}

package com.josedlpozo.series.ui.activity

import android.os.Bundle
import com.josedlpozo.series.KotlinApplication
import com.josedlpozo.series.R
import com.josedlpozo.series.model.Serie
import com.josedlpozo.series.ui.presenter.SerieDetailPresenter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*
import org.jetbrains.anko.toast
import javax.inject.Inject


/**
 * Created by josedelpozo on 9/3/16.
 */
class DetailActivity : BaseActivity(), SerieDetailPresenter.View{

    companion object {
        val SERIE_NAME = "DetailActivity:NAME"
    }

    @Inject
    lateinit var presenter : SerieDetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setupActivityComponent()
        initPresenter()
        initToolbar()
        toast(intent.getStringExtra(SERIE_NAME))
    }

    fun initToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        toolbar.setNavigationOnClickListener { finish() }
    }

    fun initPresenter(){
        presenter.view = this
        presenter.serieName = intent.getStringExtra(SERIE_NAME)
        presenter.initialize()
    }

    override fun setupActivityComponent() {
        KotlinApplication.appComponent.inject(this)
    }

    override fun hideLoading() {
        progress_bar.hide()
    }

    override fun showLoading() {
        progress_bar.show()
    }

    override fun showSerie(serie: Serie) {

        showImage(serie.image)
        showSerieName(serie.name)
        showDescription(serie.description)
    }

    fun showSerieName(name: String){
        collapsing_toolbar.setExpandedTitleTypeface(getTypeFace())
        collapsing_toolbar.setCollapsedTitleTypeface(getTypeFace())
        title = name
    }

    fun showImage(imageURL: String){
        Picasso.with(this).load(imageURL).into(serie_image)
    }

    fun showDescription(description: String){
        serie_description.text = description
    }

}
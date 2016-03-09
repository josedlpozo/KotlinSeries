package com.josedlpozo.series.ui.presenter



/**
 * Created by josedelpozo on 8/3/16.
 */
open class Presenter<T : Presenter.View> {

    var view  : View? = null

    open fun initialize() {

    }

    fun update() {

    }

    interface View {
        fun showLoading()

        fun hideLoading()
    }
}
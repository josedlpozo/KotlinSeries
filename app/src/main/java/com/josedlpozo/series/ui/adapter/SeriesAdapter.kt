package com.josedlpozo.series.ui.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.josedlpozo.series.R
import com.josedlpozo.series.model.Serie
import com.josedlpozo.series.ui.viewholders.SeriesViewHolder
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.series_item.view.*
import java.util.*

/**
 * Created by josedelpozo on 7/3/16.
 */
class SeriesAdapter(val seriesList: ArrayList<Serie>, val itemClick: (Serie) -> Unit) : RecyclerView.Adapter<SeriesViewHolder>(){

    override fun onBindViewHolder(viewHolder: SeriesViewHolder?, position: Int) {
        viewHolder?.bindData(seriesList.get(position))
    }

    override fun getItemCount(): Int {
        return seriesList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): SeriesViewHolder? {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.series_item, parent, false)
        return SeriesViewHolder(view, itemClick)
    }

}
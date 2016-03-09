package com.josedlpozo.series.ui.viewholders

import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.view.View
import com.josedlpozo.series.R
import com.josedlpozo.series.model.Serie
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.series_item.view.*

/**
 * Created by josedelpozo on 9/3/16.
 */
class SeriesViewHolder(val view: View, val itemClick: (Serie) -> Unit) : RecyclerView.ViewHolder(view) {

    fun bindData(serie: Serie){
        view.serie_name.text = serie.name
        view.serie_name.typeface = Typeface.createFromAsset(view.context.assets, view.context.getString(R.string.main_typeface))
        Picasso.with(view.context).load(serie.image).into(view.serie_image)
        view.setOnClickListener { itemClick(serie) }
    }
}
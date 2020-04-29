package com.tunc.diffutil


import android.widget.ImageView
import com.squareup.picasso.Picasso


fun ImageView.loadUrl(url: String) {
    Picasso.with(context).load(url).into(this)
}
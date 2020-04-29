package com.tunc.diffutil



data class Content(
    var id: Int,
    var text: String,
    var image: String
) : RecyclerItem(ContentViewHolder.LAYOUT_ID)

data class Content2(
    var id: Int,
    var text: String,
    var image: String
) : RecyclerItem(ContentViewHolder2.LAYOUT_ID)
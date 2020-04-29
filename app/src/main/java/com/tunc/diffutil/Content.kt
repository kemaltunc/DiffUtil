package com.tunc.diffutil

import androidx.annotation.LayoutRes


sealed class ContentItem(
    @LayoutRes layout: Int, compareId: Int,
    var content: Content? = null,
    var content2: Content2? = null
) : RecyclerItem(layout, compareId)

data class Content(
    var id: Int,
    var text: String,
    var image: String
) : ContentItem(ContentViewHolder.LAYOUT_ID, id) {
    init {
        content = this
    }
}

data class Content2(
    var id: Int,
    var text: String,
    var image: String
) : ContentItem(ContentViewHolder2.LAYOUT_ID, id) {
    init {
        content2 = this
    }
}
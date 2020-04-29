package com.tunc.diffutil

import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_item.view.*


class ContentAdapter(private val callback: Callback) :
    BaseAdapter<ContentItem, BaseViewHolder<ContentItem>>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = when (viewType) {
        ContentViewHolder.LAYOUT_ID -> {
            ContentViewHolder(parent, callback)
        }
        ContentViewHolder2.LAYOUT_ID -> {
            ContentViewHolder2(parent, callback)
        }
        else -> {
            ContentViewHolder(parent, callback)
        }
    } as BaseViewHolder<ContentItem>


}


@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class ContentViewHolder(
    parent: ViewGroup,
    private val callback: Callback
) : BaseViewHolder<Content>(parent, LAYOUT_ID) {
    override fun bindItem(item: Content) {
        with(itemView) {
            image.loadUrl(item.image)
            text.text = item.text

            remove_button.setOnClickListener {
                callback.removeItem(item)
            }


        }
    }

    companion object {
        const val LAYOUT_ID = R.layout.view_item
    }

}

class ContentViewHolder2(
    parent: ViewGroup,
    private val callback: Callback
) : BaseViewHolder<Content2>(parent, LAYOUT_ID) {
    override fun bindItem(item: Content2) {
        with(itemView) {
            image.loadUrl(item.image)
            text.text = item.text

        }
    }

    companion object {
        const val LAYOUT_ID = R.layout.view_item2
    }

}

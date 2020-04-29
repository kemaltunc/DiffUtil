package com.tunc.diffutil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

abstract class BaseViewHolder<M : RecyclerItem> : RecyclerView.ViewHolder, LayoutContainer {

    constructor(parent: ViewGroup, @LayoutRes layoutId: Int) : this(
        LayoutInflater.from(parent.context).inflate(
            layoutId,
            parent,
            false
        )
    )

    constructor(itemView: View) : super(itemView)

    override val containerView: View?
        get() = this.itemView

    abstract fun bindItem(item: M)

}

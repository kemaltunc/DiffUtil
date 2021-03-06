package com.tunc.diffutil

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import kotlin.properties.Delegates

abstract class BaseAdapter<M : RecyclerItem, VH : BaseViewHolder<M>> :
    ListAdapter<M, VH>(DiffCallback<M>()) {


    var items: List<M> by Delegates.observable(emptyList()) { prop, old, new ->
        this@BaseAdapter.submitList(items)
    }

    override fun getItemViewType(position: Int) = getItem(position).layoutId


    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH


    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bindItem(getItem(position))
    }

    class DiffCallback<M : RecyclerItem> : DiffUtil.ItemCallback<M>() {
        override fun areItemsTheSame(oldItem: M, newItem: M) =
            oldItem.comporeId == newItem.comporeId

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: M, newItem: M) = oldItem == newItem
    }

}
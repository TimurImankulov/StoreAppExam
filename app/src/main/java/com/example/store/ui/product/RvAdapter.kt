package com.example.store.ui.product

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.store.R
import com.example.store.data.model.ProductItemModel

class RvAdapter(private val listener: ItemClicks) : RecyclerView.Adapter<RvHolder>() {
    val list = arrayListOf<ProductItemModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product, parent, false)
        return RvHolder(view)
    }

    fun update(list: List<ProductItemModel>?) {
        if (list != null) {
            this.list.clear()
            this.list.addAll(list)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RvHolder, position: Int) {
        holder.bind(list[position], listener)
    }
}
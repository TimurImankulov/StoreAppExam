package com.example.store.ui.product

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.store.data.model.ProductItemModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_product.view.*

class RvHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(
        productItemModel: ProductItemModel,
        listener: ItemClicks
    ) {

        itemView.productTitle.text = productItemModel.name
        Picasso.get().load(productItemModel.image).into(itemView.image)

        itemView.setOnClickListener {
            listener.itemClicks(productItemModel)
        }
    }
}
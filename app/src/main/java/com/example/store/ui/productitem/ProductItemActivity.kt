package com.example.store.ui.productitem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.store.R
import com.example.store.data.model.ProductItemModel
import com.example.store.ui.product.ProductList
import kotlinx.android.synthetic.main.activity_product_item.*

class ProductItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_item)
        val data = intent.getParcelableExtra<ProductItemModel>(ProductList.ARTICLE)
        fillViews(data)
        setupListener()

    }

    private fun setupListener() {
        appName.setOnClickListener {
            finish()
        }
        btnBuy.setOnClickListener {
            createCustomDialog()
        }
    }

    private fun createCustomDialog() {
        CustomDialog(this).show()
    }

    private fun fillViews(data: ProductItemModel?) {
        nameOfProduct.text = data?.name
        priceOfProduct.text = data?.price
        description.text = data?.description
    }
}
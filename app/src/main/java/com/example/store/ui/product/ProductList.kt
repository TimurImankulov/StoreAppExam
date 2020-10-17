package com.example.store.ui.product

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.store.R
import com.example.store.data.model.ProductItemModel
import com.example.store.data.model.ProductModel
import com.example.store.data.remote.RetrofitBuilder
import com.example.store.ui.productitem.ProductItemActivity
import kotlinx.android.synthetic.main.activity_product_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductList : AppCompatActivity(), ItemClicks {

    private val adapter = RvAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)
        recyclerView.adapter = adapter
        setupRetrofit()
    }

    private fun setupRetrofit() {
        RetrofitBuilder.getService()
            ?.getProducts(1)
            ?.enqueue(object : Callback<ProductModel>{
                override fun onResponse(
                    call: Call<ProductModel>,
                    response: Response<ProductModel>
                ) {
                    if (response.isSuccessful && response.body() != null)
                        adapter.update(response.body()?.data)
                }

                override fun onFailure(call: Call<ProductModel>, t: Throwable) {
                    Log.d("NETWORK", "NODATA")
                }
            })
    }

    override fun itemClicks(item: ProductItemModel) {
        val intent = Intent(this, ProductItemActivity::class.java)
        intent.putExtra(ARTICLE,item)
        startActivity(intent)
    }

    companion object {
        const val ARTICLE = "ARTICLE"
    }
}
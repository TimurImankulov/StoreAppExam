package com.example.store.data.remote

import com.example.store.data.model.ProductModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface StoreService {
    @GET("public-api/products")
    fun getProducts(@Query("page")page:Int) : Call<ProductModel>
}
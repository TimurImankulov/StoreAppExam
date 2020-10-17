package com.example.store.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private var service: StoreService? = null

    fun getService(): StoreService? {
        if (service == null) service = buildRetrofit()

        return service
    }

    private fun buildRetrofit(): StoreService {
        return Retrofit.Builder()
            .baseUrl("https://gorest.co.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(StoreService::class.java)
    }
}
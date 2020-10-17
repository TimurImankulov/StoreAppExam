package com.example.store.data.model

data class ProductModel(
    val code: Int,
    val meta: PaginationModel,
    val data: List<ProductItemModel>
)
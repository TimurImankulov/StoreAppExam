package com.example.store.data.model

data class PaginationModel(
    val total: Int,
    val pages: Int,
    val page: Int,
    val limit: Int
)
package com.example.store.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CategoryItem(
    val id: Int,
    val name: String
) : Parcelable
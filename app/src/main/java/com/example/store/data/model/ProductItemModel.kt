package com.example.store.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductItemModel (
    val id : Int,
    val name : String,
    val description : String,
    val image : String,
    val price : String,
    val discount_amount : String,
    val status : Boolean,
    val categories : List<CategoryItem>
) : Parcelable
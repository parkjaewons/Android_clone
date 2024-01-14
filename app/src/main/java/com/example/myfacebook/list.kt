package com.example.myfacebook

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class info(
    val itemTitle: String,
    val itemImage: Int,
) : Parcelable

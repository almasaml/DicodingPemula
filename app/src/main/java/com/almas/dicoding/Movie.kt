package com.almas.dicoding

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var judul: String = "",
    var rilis: String = "",
    var detail: String = "",
    var poster: String = "") : Parcelable
package com.example.task2a

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LocationData(val name: String, val city: String,
                        val imageSource: String, val rating: Int,
                        val lastVisited: String): Parcelable {

}
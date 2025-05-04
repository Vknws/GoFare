package com.arvin.gofare.model

class Trip {

    data class TripData(
        val date: String,
        val route: String,
        val fare: Double
    )
}
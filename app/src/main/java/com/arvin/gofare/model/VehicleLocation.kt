package com.arvin.gofare.model

class VehicleLocation {

    data class VehicleLocationData(
        val vehicleId: String,
        val driverName: String,
        val route: String,
        val speedKph: Float,
        val latitude: Double,
        val longitude: Double
    )
}
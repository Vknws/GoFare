package com.arvin.gofare.model


class Dashboard {

    data class DashboardData(
        val totalPassengers: Int,
        val totalFareCollected: Double,
        val activeVehicles: Int,
        val reportedIssues: Int,
        val vehicleLocations: List<VehicleLocation>,
        val fareTransactions: List<FareTransaction>,
        val passengerTypeSummary: Map<String, Int>
    )
}
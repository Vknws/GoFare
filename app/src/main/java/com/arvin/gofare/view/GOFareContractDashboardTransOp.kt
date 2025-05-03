package com.arvin.gofare.view

interface GOFareContractDashboardTransOp {

    interface View {
        fun showTotalPassengers(count: Int)
        fun showTotalFareCollectedToday(amount: Double)
        fun showActiveVehicles(count: Int)
        fun showReportedIssues(count: Int)

        fun showVehicleMap(locations: List<VehicleLocation>)
        fun showFareTransactionTable(transactions: List<FareTransaction>)
        fun showPassengerTypeSummary(summary: Map<String, Int>)

        fun showLoading()
        fun hideLoading()
        fun showError(message: String)
    }

    interface Presenter {
        fun loadDashboard()
    }

    interface Model {
        fun fetchDashboardData(callback: DashboardCallback)
    }

    interface DashboardCallback {
        fun onSuccess(data: DashboardData)
        fun onFailure(errorMessage: String)
    }

    // --- Data Classes ---
    data class DashboardData(
        val totalPassengers: Int,
        val totalFareCollected: Double,
        val activeVehicles: Int,
        val reportedIssues: Int,
        val vehicleLocations: List<VehicleLocation>,
        val fareTransactions: List<FareTransaction>,
        val passengerTypeSummary: Map<String, Int>
    )

    data class VehicleLocation(
        val vehicleId: String,
        val driverName: String,
        val route: String,
        val speedKph: Float,
        val latitude: Double,
        val longitude: Double
    )

    data class FareTransaction(
        val time: String,
        val cardId: String,
        val passengerType: String,
        val vehicleId: String,
        val fareAmount: Double
    )
}
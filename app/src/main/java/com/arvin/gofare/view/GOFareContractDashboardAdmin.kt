package com.arvin.gofare.view

interface GOFareContractDashboardAdmin {
    interface View {
        fun showTotalActiveCards(count: Int)
        fun showTotalVehicles(count: Int)
        fun showActiveDrivers(count: Int)
        fun showTotalFareCollected(amount: Double)
        fun showSystemStatus(isOnline: Boolean)

        fun showGPSLocations(locations: List<BusLocation>)
        fun showLatestTransactions(transactions: List<Transaction>)
        fun showFareCollectionReport(reportData: List<DailyFareData>)
        fun showPassengerTypeDistribution(distribution: Map<String, Float>)

        fun showError(message: String)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter {
        fun loadDashboardData()
    }

    interface Model {
        fun fetchDashboardStats(callback: DashboardStatsCallback)
    }

    interface DashboardStatsCallback {
        fun onSuccess(data: DashboardData)
        fun onFailure(error: String)
    }

    // Data Models
    data class DashboardData(
        val activeCards: Int,
        val totalVehicles: Int,
        val activeDrivers: Int,
        val fareCollected: Double,
        val systemOnline: Boolean,
        val gpsLocations: List<BusLocation>,
        val recentTransactions: List<Transaction>,
        val fareReport: List<DailyFareData>,
        val passengerDistribution: Map<String, Float>
    )

    data class BusLocation(val lat: Double, val lon: Double, val label: String)

    data class Transaction(
        val time: String,
        val cardId: String,
        val passengerType: String,
        val amount: Double
    )

    data class DailyFareData(
        val day: String,
        val fareTotal: Double
    )
}
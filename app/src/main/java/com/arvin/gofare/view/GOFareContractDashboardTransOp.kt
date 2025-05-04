package com.arvin.gofare.view

import com.arvin.gofare.model.Dashboard
import com.arvin.gofare.model.FareTransaction
import com.arvin.gofare.model.VehicleLocation

interface GOFareContractDashboardTransOp {

    interface View {
        fun showTotalPassengers(count: Int)
        fun showTotalFareCollectedToday(amount: Double)
        fun showActiveVehicles(count: Int)
        fun showReportedIssues(count: Int)

        fun showVehicleMap(locations: List<VehicleLocation.VehicleLocationData>)
        fun showFareTransactionTable(transactions: List<FareTransaction.FareTransactionData>)
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
        fun onSuccess(data: Dashboard.DashboardData)
        fun onFailure(errorMessage: String)
    }



}
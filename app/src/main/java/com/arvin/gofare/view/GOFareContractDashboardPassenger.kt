package com.arvin.gofare.view

interface GOFareContractDashboardPassenger {
    interface DashboardView {
        fun showCardBalance(balance: Double)
        fun showTripHistory(trips: List<Trip>)
        fun showCardDetails(cardNumber: String, passengerType: String, status: String)
        fun showLowBalanceWarning()
        fun showError(message: String)
    }

    interface DashboardPresenter {
        fun loadCardBalance(userId: String)
        fun loadTripHistory(userId: String)
        fun loadCardDetails(userId: String)
        fun onTrackVehicleClicked()
        fun onChooseRouteClicked()
    }

    interface RepositoryDashboard {
        fun getCardBalance(userId: String, callback: BalanceCallback)
        fun getTripHistory(userId: String, callback: TripHistoryCallback)
        fun getCardDetails(userId: String, callback: CardDetailsCallback)
    }

    interface BalanceCallback {
        fun onBalanceLoaded(balance: Double)
        fun onFailure(message: String)
    }

    interface TripHistoryCallback {
        fun onHistoryLoaded(trips: List<Trip>)
        fun onFailure(message: String)
    }

    interface CardDetailsCallback {
        fun onDetailsLoaded(cardNumber: String, passengerType: String, status: String)
        fun onFailure(message: String)
    }

    // Data Models
    data class Trip(
        val date: String,
        val route: String,
        val fare: Double
    )
}
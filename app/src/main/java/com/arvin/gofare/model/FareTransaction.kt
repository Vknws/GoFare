package com.arvin.gofare.model

class FareTransaction {

    data class FareTransactionData(
        val time: String,
        val cardId: String,
        val passengerType: String,
        val vehicleId: String,
        val fareAmount: Double
    )
}
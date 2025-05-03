package com.arvin.gofare.view

interface GOFareContractRegistration {

    interface View {
        fun showFirstNameError(error: String)
        fun showLastNameError(error: String)
        fun showPhoneNumberError(error: String)
        fun showAgeError(error: String)
        fun showPassengerTypeError(error: String)
        fun showRegistrationSuccess()
        fun showRegistrationFailure(message: String)
    }

    interface Presenter {
        fun onRegisterButtonClicked(
            firstName: String,
            lastName: String,
            middleName: String?,
            phoneNumber: String,
            gender: String,
            age: String,
            passengerType: String
        )
    }

    interface Model {
        fun registerUser(
            firstName: String,
            lastName: String,
            middleName: String?,
            phoneNumber: String,
            gender: String,
            age: Int,
            passengerType: String,
            callback: RegistrationCallback
        )
    }

    interface RegistrationCallback {
        fun onSuccess()
        fun onFailure(errorMessage: String)
    }
}
package com.arvin.gofare.view

interface GOFareContractRegistrationSenior {
    interface View {
        fun showSeniorIdNumberError(error: String)
        fun showIssuingMunicipalityError(error: String)
        fun showValidIdUploadError(error: String)
        fun showDateOfBirthError(error: String)

        fun showSeniorRegistrationSuccess()
        fun showSeniorRegistrationFailure(message: String)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter {
        fun onRegisterSeniorCitizen(
            seniorIdNumber: String,
            issuingMunicipality: String,
            validIdFilePath: String,
            dateOfBirth: String
        )
    }

    interface Model {
        fun registerSeniorCitizen(
            seniorIdNumber: String,
            issuingMunicipality: String,
            validIdFilePath: String,
            dateOfBirth: String,
            callback: SeniorRegistrationCallback
        )
    }

    interface SeniorRegistrationCallback {
        fun onSuccess()
        fun onFailure(errorMessage: String)
    }
}
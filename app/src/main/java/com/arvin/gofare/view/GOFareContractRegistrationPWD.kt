package com.arvin.gofare.view

interface GOFareContractRegistrationPWD {
    interface View {
        fun showPWDIdNumberError(error: String)
        fun showDisabilityTypeError(error: String)
        fun showIssuingOfficeError(error: String)
        fun showValidIDUploadError(error: String)
        fun showDateOfBirthError(error: String)

        fun showPWDRegistrationSuccess()
        fun showPWDRegistrationFailure(message: String)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter {
        fun onRegisterPWD(
            pwdIdNumber: String,
            disabilityType: String,
            issuingOffice: String,
            validIdFilePath: String,  // path to the uploaded file
            dateOfBirth: String
        )
    }

    interface Model {
        fun registerPWDUser(
            pwdIdNumber: String,
            disabilityType: String,
            issuingOffice: String,
            validIdFilePath: String,
            dateOfBirth: String,
            callback: PWDRegistrationCallback
        )
    }

    interface PWDRegistrationCallback {
        fun onSuccess()
        fun onFailure(errorMessage: String)
    }
}
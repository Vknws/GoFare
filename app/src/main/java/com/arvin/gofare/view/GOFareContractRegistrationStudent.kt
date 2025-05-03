package com.arvin.gofare.view

interface GOFareContractRegistrationStudent {
    interface View {
        fun showSchoolNameError(error: String)
        fun showSchoolAddressError(error: String)
        fun showSchoolIdNumberError(error: String)
        fun showLevelOfStudyError(error: String)
        fun showStudentIdUploadError(error: String)
        fun showEnrollmentCertUploadError(error: String)
        fun showDateOfBirthError(error: String)

        fun showStudentRegistrationSuccess()
        fun showStudentRegistrationFailure(message: String)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter {
        fun onRegisterStudent(
            schoolName: String,
            schoolAddress: String,
            schoolIdNumber: String,
            levelOfStudy: String,
            studentIdFilePath: String,
            enrollmentCertFilePath: String,
            dateOfBirth: String
        )
    }

    interface Model {
        fun registerStudentUser(
            schoolName: String,
            schoolAddress: String,
            schoolIdNumber: String,
            levelOfStudy: String,
            studentIdFilePath: String,
            enrollmentCertFilePath: String,
            dateOfBirth: String,
            callback: StudentRegistrationCallback
        )
    }

    interface StudentRegistrationCallback {
        fun onSuccess()
        fun onFailure(errorMessage: String)
    }
}
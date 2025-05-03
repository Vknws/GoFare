package com.arvin.gofare.view

interface GOFareContractLogin {
    interface LoginView {
        fun showLoginSuccess()
        fun showLoginError(message: String)
        fun showLoading()
        fun hideLoading()
    }

    interface LoginPresenter {
        fun login(username: String, password: String)
    }

    interface SignupView {
        fun showSignupSuccess()
        fun showSignupError(message: String)
        fun showLoading()
        fun hideLoading()
    }

    interface SignupPresenter {
        fun signup(fullName: String, email: String, password: String)
    }



    // Data Callback Interfaces (Optional)
    interface RepositoryLogin {
        fun authenticate(username: String, password: String, callback: AuthCallback)
        fun registerUser(fullName: String, email: String, password: String, callback: AuthCallback)

    }

    interface AuthCallback {
        fun onSuccess()
        fun onFailure(message: String)
    }



}


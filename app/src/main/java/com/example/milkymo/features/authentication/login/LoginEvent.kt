package com.example.milkymo.features.authentication.login

sealed class LoginEvent{
    object SaveAppEntry: LoginEvent()
}

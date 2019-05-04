package com.example.mobileconf.shared

actual class ExpectedGreeting {
    actual fun getGreeting(): String{
        return "Hello people from IOS"
    }
}
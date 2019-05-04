package com.example.mobileconf.shared

class Greeting {
    fun greetMe(): String {
        val expectedGreeting = ExpectedGreeting()
        return "This is my greeting: ${expectedGreeting.getGreeting()}"
    }
}
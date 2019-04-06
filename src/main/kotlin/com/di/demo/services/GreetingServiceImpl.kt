package com.di.demo.services

class GreetingServiceImpl : GreetingService {
    private val message = "Hello"

    override fun greet(): String {
        return message
    }
}
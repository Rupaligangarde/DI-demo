package com.di.demo.services

import org.springframework.stereotype.Service

@Service
class GreetingServiceImpl : GreetingService {
    private val message = "Hello"

    override fun greet(): String {
        return message
    }
}
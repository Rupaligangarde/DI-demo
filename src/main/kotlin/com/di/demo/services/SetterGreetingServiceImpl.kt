package com.di.demo.services

import org.springframework.stereotype.Service

@Service
class SetterGreetingServiceImpl : GreetingService {
    private val message = "Hello - using setter"

    override fun greet(): String {
        return message
    }
}
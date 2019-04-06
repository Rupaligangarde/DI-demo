package com.di.demo.services

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
@Primary
class PrimaryGreetingServiceImpl : GreetingService {
    private val message = "Hello - using primary"
    override fun greet(): String {
        return message
    }
}
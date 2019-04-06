package com.di.demo.services

import org.springframework.stereotype.Service

@Service
class PropertyGreetingServiceImpl : GreetingService {
    private val message = "Hello - using property"

    override fun greet(): String {
        return message
    }
}
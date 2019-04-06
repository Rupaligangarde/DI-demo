package com.di.demo.services

import org.springframework.stereotype.Service

@Service
class ConstructorGreetingServiceImpl : GreetingService {
    private val message = "Hello - using constructor"

    override fun greet(): String {
        return message
    }
}
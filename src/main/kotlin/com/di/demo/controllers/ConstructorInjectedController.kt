package com.di.demo.controllers

import com.di.demo.services.GreetingService

class ConstructorInjectedController(private val greetingService: GreetingService) {
    fun sayHello(): String {
        return greetingService.greet()
    }
}
package com.di.demo.controllers

import com.di.demo.services.GreetingService

class SetterInjectedController {
    private var greetingService: GreetingService? = null

    fun setGreetingService(greetingService: GreetingService) {
        this.greetingService = greetingService
    }

    fun sayHello(): String {
        return this.greetingService!!.greet()
    }
}
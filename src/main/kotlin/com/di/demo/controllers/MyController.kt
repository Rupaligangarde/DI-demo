package com.di.demo.controllers

import com.di.demo.services.GreetingService
import org.springframework.stereotype.Controller

@Controller
class MyController(private val greetingService: GreetingService) {

    fun sayHello(): String {
        return greetingService.greet()
    }
}
package com.di.demo.controllers

import com.di.demo.services.GreetingService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class ConstructorInjectedController(@Qualifier(value = "constructorGreetingServiceImpl") private val greetingService: GreetingService) {
    fun sayHello(): String {
        return greetingService.greet()
    }
}
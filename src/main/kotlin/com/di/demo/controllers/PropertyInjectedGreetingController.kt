package com.di.demo.controllers

import com.di.demo.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class PropertyInjectedGreetingController {
    @Autowired
    @Qualifier(value = "propertyGreetingServiceImpl")
    lateinit var greetingService: GreetingService

    fun sayHello(): String {
        return greetingService.greet()
    }
}
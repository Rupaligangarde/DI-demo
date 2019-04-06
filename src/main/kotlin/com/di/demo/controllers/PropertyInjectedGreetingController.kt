package com.di.demo.controllers

import com.di.demo.services.GreetingServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class PropertyInjectedGreetingController {
    @Autowired
    lateinit var greetingServiceImpl: GreetingServiceImpl

    fun sayHello(): String {
        return greetingServiceImpl.greet()
    }
}
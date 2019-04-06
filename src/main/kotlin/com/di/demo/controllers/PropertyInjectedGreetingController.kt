package com.di.demo.controllers

import com.di.demo.services.GreetingServiceImpl

class PropertyInjectedGreetingController {
    var greetingServiceImpl: GreetingServiceImpl? = null

    fun sayHello(): String {
        return greetingServiceImpl!!.greet()
    }
}
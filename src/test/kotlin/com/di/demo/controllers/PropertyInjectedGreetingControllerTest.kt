package com.di.demo.controllers

import com.di.demo.services.PropertyGreetingServiceImpl
import com.di.demo.services.SetterGreetingServiceImpl
import org.junit.Assert
import org.junit.Test

class PropertyInjectedGreetingControllerTest {

    @Test
    fun shouldSayHello() {
        val controller = PropertyInjectedGreetingController()
        controller.greetingService = PropertyGreetingServiceImpl()
        val result = controller.sayHello()
        Assert.assertEquals(
                "Hello - using property",
                result
        )
    }
}
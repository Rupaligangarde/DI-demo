package com.di.demo.controllers

import com.di.demo.services.GreetingServiceImpl
import org.junit.Assert
import org.junit.Test

class PropertyInjectedGreetingControllerTest {

    @Test
    fun shouldSayHello() {
        val controller = PropertyInjectedGreetingController()
        controller.greetingServiceImpl = GreetingServiceImpl()
        val result = controller.sayHello()
        Assert.assertEquals(
                "Hello",
                result
        )
    }
}
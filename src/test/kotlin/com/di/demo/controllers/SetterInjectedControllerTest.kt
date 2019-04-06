package com.di.demo.controllers

import com.di.demo.services.GreetingServiceImpl
import org.junit.Assert
import org.junit.Test

class SetterInjectedControllerTest {

    @Test
    fun sayHello() {
        val setterInjectedController = SetterInjectedController()
        setterInjectedController.setGreetingService(GreetingServiceImpl())
        val result = setterInjectedController.sayHello()
        Assert.assertEquals(
                "Hello",
                result

        )
    }
}
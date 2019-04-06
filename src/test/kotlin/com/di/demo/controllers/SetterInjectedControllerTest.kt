package com.di.demo.controllers

import com.di.demo.services.SetterGreetingServiceImpl
import org.junit.Assert
import org.junit.Test

class SetterInjectedControllerTest {

    @Test
    fun sayHello() {
        val setterInjectedController = SetterInjectedController()
        setterInjectedController.setGreetingService(SetterGreetingServiceImpl())
        val result = setterInjectedController.sayHello()
        Assert.assertEquals(
                "Hello - using setter",
                result

        )
    }
}
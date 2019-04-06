package com.di.demo.controllers

import com.di.demo.services.GreetingServiceImpl
import org.junit.Assert
import org.junit.Test

class ConstructorInjectedControllerTest {

    @Test
    fun shouldSayHello() {
        val constructorInjectedController = ConstructorInjectedController(GreetingServiceImpl())
        val result = constructorInjectedController.sayHello()
        Assert.assertEquals(
                "Hello",
                result
        )
    }
}
package com.di.demo.controllers

import com.di.demo.services.ConstructorGreetingServiceImpl
import org.junit.Assert
import org.junit.Test

class ConstructorInjectedControllerTest {

    @Test
    fun shouldSayHello() {
        val constructorInjectedController = ConstructorInjectedController(ConstructorGreetingServiceImpl())
        val result = constructorInjectedController.sayHello()
        Assert.assertEquals(
                "Hello - using constructor",
                result
        )
    }
}
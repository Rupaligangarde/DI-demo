package com.di.demo.controllers

import com.di.demo.services.PrimaryGreetingServiceImpl
import org.junit.Assert
import org.junit.Test


class MyControllerTest {

    @Test
    fun shouldSayHello() {
        val myController = MyController(PrimaryGreetingServiceImpl())
        Assert.assertEquals(
                "Hello - using primary",
                myController.sayHello()
        )
    }
}
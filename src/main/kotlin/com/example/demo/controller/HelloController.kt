package com.example.demo.controller

import org.springframework.boot.SpringBootConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootConfiguration
class HelloService {
    @GetMapping("/hello-all") // Доступ у всех пользователей
    fun sayHelloAll() : String {
        return "Hello users and admins!"
    }

    @GetMapping("/hello-user") // Доступ только у пользователей
    fun sayHelloUser() : String {
        return "Hello only users!"
    }

    @GetMapping("/hello-admin")
    fun sayHelloAdmin() : String { // Доступ только у админа
        return "Hello only admins!"
    }
}
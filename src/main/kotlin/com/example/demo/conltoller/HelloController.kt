package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/hello-all")
    fun helloAllController() = "Hello"

    @GetMapping("/hello-user")
    fun helloUserController() = "Hello, user"

    @GetMapping("/hello-admin")
    fun helloAdminController() = "Hello, admin"
}
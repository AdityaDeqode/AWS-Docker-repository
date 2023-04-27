package com.example.demo2.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

class MyController {

    @RestController
    class DockerProductController2 {
        @get:GetMapping("/product")
        val message: String
            get() = "A brand new product"
    }



}
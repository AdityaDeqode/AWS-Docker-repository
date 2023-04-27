package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

class MyController {


    @RestController
    class DockerProductController2 {
        @get:GetMapping("/products")
        val message: String
            get() = "A brand new product"
    }


}
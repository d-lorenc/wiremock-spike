package me.lorenc.mockspike

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ProducerApplication

fun main(args: Array<String>) {
    SpringApplication.run(ProducerApplication::class.java, *args)
}

@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello() = "hello"
}
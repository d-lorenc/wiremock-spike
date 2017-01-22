package me.lorenc.mockspike

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@SpringBootApplication
open class ConsumerApplication

fun main(args: Array<String>) {
    SpringApplication.run(ConsumerApplication::class.java, *args)
}

@Service
class Client(private val restTemplate: RestTemplate, @Value("\${producer.base.url}") private val producerBaseUrl: String) {
    fun get(): String {
        val response = restTemplate.getForEntity("${producerBaseUrl}/hello", String::class.java)
        println("response: ${response}")
        return response.body
    }
}

@RestController
class ConsumeController(private val client: Client) {
    @GetMapping("/consume")
    fun hello() = client.get()
}
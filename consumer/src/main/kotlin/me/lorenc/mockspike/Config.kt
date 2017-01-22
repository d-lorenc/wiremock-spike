package me.lorenc.mockspike

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
open class Config {

    @Bean
    open fun restTemplate(): RestTemplate {
//        val requestFactory = SimpleClientHttpRequestFactory()
//        val proxy = Proxy(Proxy.Type.HTTP, InetSocketAddress("localhost", 8089))
//        requestFactory.setProxy(proxy)
//        return RestTemplate(requestFactory)
        return RestTemplate()
    }
}

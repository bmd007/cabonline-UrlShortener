package ir.tiroon.cabonline.codechallenge.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class Config {

//    @Bean
//    @Primary
//    ReactiveRedisConnectionFactory reactiveRedisConnectionFactory(){
//        new LettuceConnectionFactory()
//    }
//
//    @Bean
//    ReactiveRedisTemplate<String, String> template(ReactiveRedisConnectionFactory connectionFactory){
//        new ReactiveRedisTemplate<String, String>(connectionFactory, RedisSerializationContext.string())
//    }




    @Bean
    @Primary
    ObjectMapper objectMapper2() {
        new ObjectMapper()
                .registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule())
    }
}

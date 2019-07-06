package com.example.demo.common.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonConfig {
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverts() {
        //1.定义一个converter
       // FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        return null;
    }
}

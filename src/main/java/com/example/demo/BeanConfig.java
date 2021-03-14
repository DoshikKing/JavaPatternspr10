package com.example.demo;

import com.example.demo.components.Junior;
import com.example.demo.components.Middle;
import com.example.demo.components.Senior;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("Junior")
    public Junior junior() {
        return new Junior();
    }
    @Bean("Middle")
    public Middle middle() {
        return new Middle();
    }
    @Bean("Senior")
    public Senior senior() {
        return new Senior();
    }
}

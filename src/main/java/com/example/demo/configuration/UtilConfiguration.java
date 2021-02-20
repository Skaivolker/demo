package com.example.demo.configuration;

import com.example.demo.StringLenghtCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {


    @Bean("Count")
    public StringLenghtCounter stringLenghtCounter(){
        return new StringLenghtCounter();
    }
}

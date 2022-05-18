package com.online.test.onlinetest;

import org.springframework.context.annotation.Configuration;

//para mappear
@Configuration 
public class ApplicationConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}

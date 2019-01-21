package com.ecommerce.ordersconsumer;


import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ecommerce.ordersconsumer.contract.parser"})
@ComponentScan({"com.ecommerce.ordersconsumer.consumer"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Gson gson(){
        return new Gson();
    }
}
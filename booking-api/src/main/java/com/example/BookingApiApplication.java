package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BookingApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingApiApplication.class, args);
    }
}

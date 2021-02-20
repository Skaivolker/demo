package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NamePrintingService {

    public static String run(String... args) throws Exception {
        return " Name";
    }
}

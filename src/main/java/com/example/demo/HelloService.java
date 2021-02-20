package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements CommandLineRunner {


    private NamePrintingService namePrintingService;
    private final PhoneNumberPrintingService phoneNumberPrintingService;

    public HelloService(PhoneNumberPrintingService phoneNumberPrintingService) {
        this.phoneNumberPrintingService = phoneNumberPrintingService;
    }

    @Autowired
    public void setNamePrintingService(NamePrintingService namePrintingService) {
        this.namePrintingService = namePrintingService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello"
                + NamePrintingService.run("")
                + PhoneNumberPrintingService.run(""));
    }
}

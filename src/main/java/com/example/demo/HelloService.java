package com.example.demo;

import com.example.demo.configuration.UtilConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements CommandLineRunner {


    private NamePrintingService namePrintingService;
    private final PhoneNumberPrintingService phoneNumberPrintingService;
    private final StringLenghtCounter stringLenghtCounter;

    public HelloService(PhoneNumberPrintingService phoneNumberPrintingService, StringLenghtCounter stringLenghtCounter) {
        this.phoneNumberPrintingService = phoneNumberPrintingService;
        this.stringLenghtCounter = stringLenghtCounter;
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
        System.out.println(stringLenghtCounter.countLenght("@RestController is a specialized version of the controller. It includes the @Controller and @ResponseBody annotations and as a result, simplifies the controller implementation"));
    }

}

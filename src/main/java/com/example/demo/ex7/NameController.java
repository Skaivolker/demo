package com.example.demo.ex7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class NameController {

    @GetMapping("/api/pairs/{name}")
    public NamedPairs getNamePairs(@PathVariable("name") String userName){
        return NamedPairs.builder()
                         .simpleName(userName)
                         .pairs(Map.of())
                         .build();
    }
}

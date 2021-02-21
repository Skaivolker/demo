package com.example.demo.th;

import com.example.demo.rest.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControl {

    @GetMapping("/hello")
    public String showHello(final ModelMap modelMap) {
        modelMap.addAttribute("text", "Welcome!");
        modelMap.addAttribute("user", new User());
        return "welcome";
    }
}

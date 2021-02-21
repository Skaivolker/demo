package com.example.demo.th;

import com.example.demo.rest.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloControl {

    List<User> users = new ArrayList<>();

    @GetMapping("/hello")
    public String showHello(final ModelMap modelMap) {
        modelMap.addAttribute("text", "Welcome!");
        modelMap.addAttribute("user", new User());
        modelMap.addAttribute("users", users);
        return "welcome";
    }
}

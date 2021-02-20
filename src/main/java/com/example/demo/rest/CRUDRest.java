package com.example.demo.rest;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CRUDRest {

    List<User> users = new ArrayList<>();

    @GetMapping("/name/{personal-id}")
    public String getName(@PathVariable("id") String id){
        return "Name " + id;
    }

    @PostMapping("/user/new")
    public String createUser(@RequestBody User user){
        users.add(user);
        return "OK " + user.getName();
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        users.add(user);
        for (User user1 : users) {
            if(user1.getName().equals(user.getName())){
                user1.setEmail(user.getEmail());
            }
        }
        return "OK " + user.getName();
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return users;
    }

    @DeleteMapping("/name/{name}")
    public String deleteUser(@PathVariable("name") String name){
        for (User user : users){
            if (user.getName().equals(name)){
                users.remove(user);
                break;
            }
        }
        return "OK";
    }

}

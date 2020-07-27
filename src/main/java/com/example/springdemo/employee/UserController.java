package com.example.springdemo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public List<User> getDetails(){
        return userService.getDetails();
    }

    @RequestMapping(method = RequestMethod.POST, value="/get")
    public void addDetails(@RequestBody User user){
        //System.out.println(body.get("name"));
        userService.addDetails(user);

    }
    @RequestMapping(method = RequestMethod.PUT, value="/get/{id}")
    public void editDetails(@RequestBody User user, @PathVariable String id){
        userService.editDetails(user,id);
    }




}

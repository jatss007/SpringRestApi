package com.example.springdemo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getDetails(){
        List<User> l=new ArrayList<>();

        userRepository.findAll().forEach(l::add);

        return l;
    }

    public void addDetails(User user) {
        userRepository.save(user);
    }

    public void editDetails(User user,String id) {
        User userId=userRepository.getOne(Integer.parseInt(id));
        userId.setName(user.getName());
        userId.setDesignation(user.getDesignation());
        userId.setSalary(user.getSalary());
        userRepository.save(userId);
    }
}

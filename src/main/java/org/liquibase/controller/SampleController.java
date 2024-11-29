package org.liquibase.controller;


import org.liquibase.entity.UserDetailsEntity;
import org.liquibase.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @GetMapping
    public List<UserDetailsEntity> test(){
        return userDetailsRepository.findAll();
    }

    @PostMapping
    public UserDetailsEntity testPost(@RequestBody UserDetailsEntity userDetailsEntity){
        return  userDetailsRepository.save(userDetailsEntity);

    }
}

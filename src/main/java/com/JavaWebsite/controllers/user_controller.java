package com.JavaWebsite.controllers;

import com.JavaWebsite.models.*;
import com.JavaWebsite.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class user_controller{

    @Autowired
    private user_dao userDao;
    @RequestMapping(value = "api/user/{id}", method = RequestMethod.GET)
    public user getUser(@PathVariable Long id){
        user userData = new user();
        userData.setId(id);
        userData.setName("Douglas");
        userData.setLast_name("Cabrera");
        userData.setEmail("douglascabrera.dev@gmail.com");
        userData.setPhone("7166-8439");
        userData.setPassword("safepassword");

        return userData;
    }

    @RequestMapping(value = "api/tables")
    public List<user> getUsers(){
        return userDao.getUser();
    }
}

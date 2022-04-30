package com.JavaWebsite.controllers;

import com.JavaWebsite.models.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class user_controller{
    @RequestMapping(value = "user/{id}")
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

    @RequestMapping(value = "users")
    public List<user> getUsers(){
        List<user> users = new ArrayList<>();

        /*user user_1 = new user();
        user_1.setId(1L);
        user_1.setName("Tiger");
        user_1.setLastName("Nixon");
        user_1.setEmail("tigetnixon@gmail.com");
        user_1.setPhone("959-2700");

        user user_2 = new user();
        user_2.setId(2L);
        user_2.setName("Garrett");
        user_2.setLastName("Winters");
        user_2.setEmail("garretwinters@gmail.com");
        user_2.setPhone("579-8793");

        user user_3 = new user();
        user_3.setId(3L);
        user_3.setName("Ashton");
        user_3.setLastName("Cox");
        user_3.setEmail("ashtoncox@gmail.com");
        user_3.setPhone("426-2822");

        user user_4 = new user();
        user_4.setId(4L);
        user_4.setName("Cedric");
        user_4.setLastName("Kelly");
        user_4.setEmail("cendricKelly@gmail.com");
        user_4.setPhone("412-8676");

        user user_5 = new user();
        user_5.setId(5L);
        user_5.setName("Airi");
        user_5.setLastName("Satou");
        user_5.setEmail("airisatou@gmail.com");
        user_5.setPhone("648-4912");

        users.add(user_1);
        users.add(user_2);
        users.add(user_3);
        users.add(user_4);
        users.add(user_5);*/
        return users;
    }

    /*@RequestMapping(value = "user3")
    public user editUser(){
        user userData = new user();
        userData.setName("Douglas");
        userData.setLastName("Cabrera");
        userData.setEmail("douglascabrera.dev@gmail.com");
        userData.setPhone("7166-8439");
        userData.setPassword("safepassword");

        return userData;
    }

    @RequestMapping(value = "user2")
    public user deleteUser(){
        user userData = new user();
        userData.setName("Douglas");
        userData.setLastName("Cabrera");
        userData.setEmail("douglascabrera.dev@gmail.com");
        userData.setPhone("7166-8439");
        userData.setPassword("safepassword");

        return userData;
    }

    @RequestMapping(value = "user1")
    public user findUser(){
        user userData = new user();
        userData.setName("Douglas");
        userData.setLastName("Cabrera");
        userData.setEmail("douglascabrera.dev@gmail.com");
        userData.setPhone("7166-8439");
        userData.setPassword("safepassword");

        return userData;
    }*/
}

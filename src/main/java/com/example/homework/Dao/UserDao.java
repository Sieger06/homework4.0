package com.example.homework.Dao;

import com.example.homework.Model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();


}
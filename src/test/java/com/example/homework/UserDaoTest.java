package com.example.homework;

import com.example.homework.Dao.UserDaoImpl;
import com.example.homework.Model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.annotations.Parameters;

import java.util.Arrays;

class UserDaoTest {


    private User userForTest = new User("Петя", 23);


    private UserDaoImpl userDaoImpl = new UserDaoImpl();

    @Test
    void shouldGetUserByNameReturnUser() {
        Assertions.assertEquals(userDaoImpl.getUserByName("Петя"), userForTest);
    }

    @Test
    void shouldFindAllUsers() {
        Assertions.assertNull(userDaoImpl.getUserByName("Слава"));
    }
}
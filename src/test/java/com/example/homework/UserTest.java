package com.example.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private String login = "login";
    private String email = "email";

    @Test
    public void shouldCreatUserWithArg (){
        String login = "login";
        String email = "@email.com";
        User user = new User(login, email);
        assertTrue(login.equals(user.getLogin()) && email.equals(user.getEmail()));
    }

    @Test
    public void shouldCreateWhithoutArg() {
        User user = new User();
        assertTrue((user.getEmail()==null && user.getLogin()==null));
    }

    @Test
    public void shouldEmailIsCorrect(){
        assertThrows(IllegalArgumentException.class, ()-> new User("login", "email"));
    }

    @Test
    public void shouldLoginAndEmailWereDifferent (){
        assertThrows(IllegalArgumentException.class, ()-> new User("login", "login"));
    }



}

package com.example.homework.Service;

import com.example.homework.Dao.UserDaoImpl;
import com.example.homework.Model.User;

public class UserServiceImpl implements UserService {

    private UserDaoImpl userDaoImpl;

    public UserServiceImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }


    @Override
    public boolean checkUserExist (User user){
        return userDaoImpl.getUserList().contains(user);
    }


}

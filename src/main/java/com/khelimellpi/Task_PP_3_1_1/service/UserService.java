package com.khelimellpi.Task_PP_3_1_1.service;

import com.khelimellpi.Task_PP_3_1_1.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(Long id, User user);

    void removeUser(Long id);

    User getUserById(Long id);

    List<User> getAllUsers();
}

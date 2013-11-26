package com.epam.mb;

import java.util.List;

public interface UserMapper {

    List<User> findAllUsers();
    User findUserById(int id);
    void insertUser(User user);
}

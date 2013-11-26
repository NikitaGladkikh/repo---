package com.epam.mb;

import com.epam.mb.User;
import com.epam.mb.UserService;

public class Main {

    public static void main(String[] args) {

        UserService service = new UserService();
        User user = service.findUserById(4);
        System.out.println(user.toString());
    }

}

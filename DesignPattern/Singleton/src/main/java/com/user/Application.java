package com.user;

import java.util.logging.Logger;

public class Application {

    public static void main(String[] args) {

        long start;
        long end;

        User user = User.getUser();
        System.out.println(user);

        start = System.currentTimeMillis();
        Logger logger = user.getLogger();
        end = System.currentTimeMillis();
        System.out.println(end - start);

        User loggedInUser = User.getUser();

        start = System.currentTimeMillis();
        Logger newLogger = user.getLogger();
        end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println(loggedInUser);
    }
}

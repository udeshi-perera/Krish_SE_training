package com.user;

import java.util.logging.Logger;

public class User {

    private static volatile User user;

    private static volatile Logger logger;

    private User() {
        //if interfere with reflecting framework block them
        if (user != null) {
            throw new RuntimeException("Use getUser() method");
        }
    }

    public static User getUser() {

        if (user == null) {
            //double checking singleton
            synchronized (User.class) {
                if (user == null) {
                    user = new User();
                }
            }
        }
        return user;
    }

    //create or find logger
    public Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    String name = "com.user";
                    logger = Logger.getLogger(name);
                }
            }
        }
        return logger;
    }
}

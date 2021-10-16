package com.company.utils;

import com.company.model.User;

import java.util.ArrayList;

public class UserManager {
    private static final ArrayList<User> users = FileManager.readUsersData();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static User getUser(String login) {
        for (User user : users) {
            if (user.getLogin().equalsIgnoreCase(login)) {
                return user;
            }
        }
        return null;
    }

    public static User logIntoUserAccount(String login, String password) {
        User user = getUser(login);

        if (user != null) {
            if (PasswordManager.isPasswordCorrect(password, user.getPassword())) {
                return user;
            }
        }

        return null;
    }

    public static void addUser(User user) {
        if (getUser(user.getLogin()) == null) {
            users.add(user);
        } else {
            System.out.println("\nUser with such login already exist.");
        }

    }

    public static boolean isLoginUnique(String login) {
        for (User user : getUsers()) {
            if (login.equalsIgnoreCase(user.getLogin())) {
                return false;
            }
        }
        return true;
    }
}

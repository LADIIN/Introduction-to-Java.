package com.company.model;

import com.company.utils.AccessLevel;

public class User {
    private static int basicID = 1;
    private final int id;
    private String username;
    private String login;
    private String password;
    private String email;
    private AccessLevel accessLevel;

    public User(String username, String login, String password, String email, AccessLevel accessLevel) {
        this.id = basicID++;
        this.username = username;
        this.login = login;
        this.password = password;
        this.email = email;
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + this.username + '\'' +
                ", login='" + this.login + '\'' +
                ", password='" + this.password + '\'' +
                ", email='" + this.email + '\'' +
                ", accessLevel=" + this.accessLevel +
                '}';
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public AccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }
}

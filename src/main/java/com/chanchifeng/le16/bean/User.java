package com.chanchifeng.le16.bean;

/**
 * @author:porschan
 * @description:
 * @date: Created in 15:49 2018/12/8
 * @modified By:
 */

public class User {
    private int id;
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

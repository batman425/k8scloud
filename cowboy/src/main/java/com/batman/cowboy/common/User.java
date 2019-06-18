package com.batman.cowboy.common;

import java.io.Serializable;

/**
 * @author liusongwei
 * @Title: User
 * @ProjectName batman
 * @Description: TODO
 * @date 2019/6/1415:58
 */
public class User implements Serializable {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

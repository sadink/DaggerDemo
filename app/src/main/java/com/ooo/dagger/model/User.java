package com.ooo.dagger.model;

import java.io.Serializable;

/**
 * Created by Dongdd on 2019/9/18 0018 10:35.
 */
public class User implements Serializable {

    private String id;
    private String pwd;
    private String userName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

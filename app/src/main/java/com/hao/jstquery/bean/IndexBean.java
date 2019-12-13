package com.hao.jstquery.bean;

import java.util.List;

public class IndexBean {

    UserBean user;
    List<String> auths;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public List<String> getAuths() {
        return auths;
    }

    public void setAuths(List<String> auths) {
        this.auths = auths;
    }
}

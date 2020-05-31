package com.wanglun.price.model;

public class User {
    private Integer id;

    private Integer wlRoleId;

    private String userName;

    private String userPwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWlRoleId() {
        return wlRoleId;
    }

    public void setWlRoleId(Integer wlRoleId) {
        this.wlRoleId = wlRoleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }
}
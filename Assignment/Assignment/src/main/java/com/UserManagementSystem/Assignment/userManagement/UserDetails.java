package com.UserManagementSystem.Assignment.userManagement;

public class UserDetails {
    private String userId="222";
    private String name;
    private String userName;
    private String address;
    private String phNo;

    public UserDetails(String userId, String name, String userName, String address, String phNo) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.phNo = phNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }
}

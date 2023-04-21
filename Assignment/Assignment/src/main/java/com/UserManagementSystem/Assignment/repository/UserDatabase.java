package com.UserManagementSystem.Assignment.repository;

import com.UserManagementSystem.Assignment.userManagement.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserDatabase {
    ArrayList<UserDetails>list=new ArrayList<>();

    public String Save(UserDetails data){
        list.add(data);
        return "User Details Added///";
    }
    public ArrayList<UserDetails> CallArrayList(){
        return list;
    }

    public ArrayList<UserDetails> ListReturn(){
        return list;
    }
}

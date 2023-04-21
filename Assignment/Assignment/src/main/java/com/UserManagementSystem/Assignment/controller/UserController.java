package com.UserManagementSystem.Assignment.controller;

import com.UserManagementSystem.Assignment.repository.UserDatabase;
import com.UserManagementSystem.Assignment.service.UserService;
import com.UserManagementSystem.Assignment.userManagement.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class UserController {
    @Autowired
    UserService s1;
    @PostMapping("/addData")
    public String AddDetails(@RequestBody UserDetails userdata){
        return s1.AddUserdetails(userdata);
    }
    @GetMapping("/getDataById/{userId}")
    public ArrayList<UserDetails> ShowDataById(@PathVariable String userId){
        return s1.PrintObjById(userId);
    }

    @GetMapping("/getData")
    public ArrayList<UserDetails> ShowData(){
        return s1.PrintObj();
    }

    @PutMapping("/UpdateUserAddress/{id}/{addressNew}")
    public String UpdateData(@PathVariable String id,@PathVariable String addressNew){
        return s1.UpdateAddress(id,addressNew);
    }
@DeleteMapping("/deleteUser/{id}")
    public String deleteuserData(@PathVariable String id){
        return s1.DeleteUserById(id);
    }

}

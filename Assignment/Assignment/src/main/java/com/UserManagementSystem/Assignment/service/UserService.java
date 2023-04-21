package com.UserManagementSystem.Assignment.service;

import com.UserManagementSystem.Assignment.repository.UserDatabase;
import com.UserManagementSystem.Assignment.userManagement.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserDatabase d1;

    public String AddUserdetails(UserDetails data) {
        return d1.Save(data);

    }

    public ArrayList<UserDetails> PrintObjById(String Id) {
        ArrayList<UserDetails> list2 = d1.ListReturn();
        ArrayList<UserDetails> list3 = new ArrayList<>();
        for (UserDetails data : list2) {
            if (data.getUserId().equals(Id)) {
                list3.add(data);
            }
        }
        return list3;
    }

    public ArrayList<UserDetails> PrintObj() {
        return d1.CallArrayList();
    }

    public String UpdateAddress(String id, String addressNew) {
        ArrayList<UserDetails> list2 = d1.ListReturn();

        for (UserDetails data : list2) {
            if (data.getUserId().equals(id)) {
                list2.remove(data);

                data.setAddress(addressNew);
                list2.add(data);

                return "Address Updated////";
            }
        }
        return "Address not Updated Error....///";
    }

    public String DeleteUserById(String id) {
        ArrayList<UserDetails> list2 = d1.ListReturn();
        for (UserDetails data : list2) {
            if (data.getUserId().equals(id)) {
                list2.remove(data);

                return "User Deleted Succsesfully////";
            }
        }
        return "User Not Exist...Error ////";
    }
}


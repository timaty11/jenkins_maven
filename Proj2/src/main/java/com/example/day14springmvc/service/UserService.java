package com.example.day14springmvc.service;

import com.example.day14springmvc.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    ArrayList<User> users = new ArrayList<User>();

    public boolean loginValidate(User user) {
        User temp = users.stream().filter(tmp -> tmp.getUname().equals(user.getUname())).findFirst().orElse(null);

        if (temp.getPass().equals(user.getPass())) {
            return true;
        } else {
            return false;
        }

    }

    public boolean registerValidate(User user) {
        if (!user.getUname().isEmpty() && !user.getPass().isEmpty() && !user.getEmail().isEmpty() && !user.getCity().isEmpty()) {
            users.add(user);

            System.out.println(users);

            return true;
        } else {
            return false;
        }
    }

    public List<User> loadAll() {
        return users;
    }

    public User loadUserData(String uname) {
        User temp = users.stream().filter(tmp -> tmp.getUname().equals(uname)).findFirst().orElse(null);

        return temp;
    }

    public String deleteUserData(String uname) {
        for (User u : users) {
            if (u.getUname().equals(uname)) {
                users.remove(u);
                return "user removed successfully";
            }
        }
        return "user not found!";
    }

    public String updateUserData(String uname, User user) {
        for (User u : users) {
            if (u.getUname().equals(uname)) {
                users.remove(u);
                users.add(user);
                return "user updated successfully";
            }
        }
        return "user not found!";
    }

}

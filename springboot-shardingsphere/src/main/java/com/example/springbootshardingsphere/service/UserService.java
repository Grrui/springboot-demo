package com.example.springbootshardingsphere.service;

import com.example.springbootshardingsphere.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wang Erniu
 * @date 2021/03/04 16:21
 */
@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public void testUpdate(String name, Integer age) {
        userRepo.updateAge(name, age);
    }

    public Integer testSelect(String name) {
        return userRepo.findByName(name).getAge();
    }

}

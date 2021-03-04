package com.example.springbootshardingsphere.contoller;

import com.example.springbootshardingsphere.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wang Erniu
 * @date 2021/03/04 16:03
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public Integer testInsert() {
        log.info("start update");
        userService.testUpdate("zhangsan", (int) (Math.random() * 100));
        log.info("start select");
        return userService.testSelect("zhangsan");
    }

}

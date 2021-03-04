package com.example.springbootshardingsphere.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Wang Erniu
 * @date 2021/03/04 16:04
 */
@Entity
@Data
@Table(name = "t_user")
public class UserDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    Integer age;

    public UserDO() {
    }

    public UserDO(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

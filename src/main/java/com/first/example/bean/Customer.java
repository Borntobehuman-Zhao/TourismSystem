package com.first.example.bean;

import lombok.Data;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/23 9:35
 */
@Data
public class Customer {
    private Integer id;
    private String phone;
    private String idNumber;
    private String password;
    private String name;
    private Integer sex;
}

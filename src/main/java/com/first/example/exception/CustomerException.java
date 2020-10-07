package com.first.example.exception;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/23 16:18
 */
public class CustomerException extends RuntimeException{

    private String phone;

    private String message;

    public CustomerException(String phone, String message) {
        this.phone = phone;
        this.message = message;
    }
}

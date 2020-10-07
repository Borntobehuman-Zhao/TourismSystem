package com.first.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/24 11:34
 */
public class Webconfig implements WebMvcConfigurer {

    @Autowired
    Myintercptor myintercptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
}

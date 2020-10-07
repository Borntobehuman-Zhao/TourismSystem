package com.first.example.config;

import com.first.example.bean.Customer;
import com.first.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/24 11:08
 */
@Component
@SuppressWarnings("all")
public class Myintercptor implements HandlerInterceptor {

    @Autowired
    CustomerService customerService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*HttpSession session = request.getSession();
        if (request.getRequestURI().contains("/registry")
                || request.getRequestURI().contains("/login")
                || request.getRequestURI().contains("/needLogin")) {
            return true;
        }
        Customer resCustomer = (Customer) session.getAttribute("customer");
        if (resCustomer != null) {
            return true;
        }*/
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

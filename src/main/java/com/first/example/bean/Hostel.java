package com.first.example.bean;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/25 11:19
 */
@Data
public class Hostel {
    private Integer id;
    private String name;
    private String phone;
    private String address;
    private String url;
}

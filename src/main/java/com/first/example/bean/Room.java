package com.first.example.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/25 14:52
 */
@Data
public class Room {
    private Integer id;
    private String roomId;
    private String administrator;
    private Integer member;
    private Integer status;
    private Integer hostelId;
    private Double price;
    private String type;
    private Date startTime;
    private Date endTime;
}

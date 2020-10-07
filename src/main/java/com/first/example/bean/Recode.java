package com.first.example.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/25 14:55
 */
@Data
public class Recode {
    private Integer id;
    private Integer customerId;
    private Integer hostelId;
    private Integer roomId;
    private Date time;
}

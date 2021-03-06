package com.first.example.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/10/7 12:07
 */
@Data
public class HostelRoom {
    private String roomId;
    private Integer hostelId;
    private Integer status;
    private String administrator;
    private Date startTime;
    private Date endTime;
}

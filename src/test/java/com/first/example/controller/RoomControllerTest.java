package com.first.example.controller;

import com.first.example.bean.Room;
import com.first.example.mapper.RoomMapper;
import com.first.example.service.RoomService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/28 14:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomControllerTest {

    @Autowired
    RoomService roomService;

    @Test
    public void offset() {
        List<Room> lists =  roomService.findRooms(1,2,1);
        System.out.println(lists.toString());
    }

    @Test
    public void offsetEnd() {
    }
}
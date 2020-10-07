package com.first.example.service.imp;

import com.first.example.bean.Attraction;
import com.first.example.bean.Hostel;
import com.first.example.mapper.AttractionMapper;
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
 * @date : 2020/9/24 16:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AttractionServiceImplTest {
    @Autowired
    AttractionMapper attractionMapper;
    @Test
    public void findAttractionsByKey() {
        List list = attractionMapper.findAttractionsByKey("香");
        System.out.println(list.toString());
    }
    @Test
    public void findAttractions(){
        List<Attraction> list = attractionMapper.findAttractions(2);
        System.out.println(list.toString());
    }
    @Test
    public void findHostel(){
        List<Hostel> list = attractionMapper.findHostel(1);
        System.out.println(list.toString());
    }
}
package com.first.example.service;

import com.first.example.bean.Attraction;
import com.first.example.bean.Hostel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/25 14:13
 */
public interface HostelService {
    /**
     * 查询推荐酒店
     * @param limit 给定一个查询界限
     * @return 返回酒店列表
     */
    public List<Hostel> findHostelByLimit(Integer limit);

    /**
     * 查询与酒店合作的景点
     * @param hostelId 酒店的Id号
     * @return 返回景点列表
     */
    public List<Attraction> findAttractions(Integer hostelId);
}

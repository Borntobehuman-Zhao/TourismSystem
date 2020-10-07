package com.first.example.service.imp;

import com.first.example.bean.Attraction;
import com.first.example.bean.Hostel;
import com.first.example.mapper.HostelMapper;
import com.first.example.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/25 14:14
 */
@Service
public class HostelServiceImpl implements HostelService {

    @Autowired
    HostelMapper hostelMapper;

    /**
     * 查询推荐酒店
     *
     * @param limit 给定一个查询界限
     * @return 返回酒店列表
     */
    @Override
    public List<Hostel> findHostelByLimit(Integer limit) {
        try{
           return hostelMapper.findHostelByLimit(limit);
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 查询与酒店合作的景点
     * @param hostelId 酒店的Id号
     * @return 返回景点列表
     */
    @Override
    public List<Attraction> findAttractions(Integer hostelId) {
        try{
            return hostelMapper.findAttractions(hostelId);
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

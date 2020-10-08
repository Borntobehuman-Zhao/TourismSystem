package com.first.example.service.imp;

import com.first.example.bean.Attraction;
import com.first.example.bean.Hostel;
import com.first.example.mapper.AttractionMapper;
import com.first.example.service.AttractionService;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/24 16:36
 */
@Service
public class AttractionServiceImpl implements AttractionService {

    @Autowired
    AttractionMapper attractionMapper;

    /**
     * 模糊搜索景点
     *
     * @param keyWord 客户输入的搜索的关键字
     * @return 符合搜索范围的景点
     */
    @Override
    public List<Attraction> findAttractionsByKey(String keyWord) {
        try {
            return attractionMapper.findAttractionsByKey(keyWord);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 用来推荐出几个景点
     *
     * @param limit 传入需要查询的界限值
     * @return 返回对应的景点数据
     */
    @Override
    public List<Attraction> findAttractions(Integer limit) {
        try {
            return attractionMapper.findAttractions(limit);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 查询与景点合作的酒店
     *
     * @param attractionId 景点的id号
     * @return 查询到的酒店列表
     */
    @Override
    public List<Hostel> findHostel(Integer attractionId) {
        try {
            return attractionMapper.findHostel(attractionId);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 查询所有景点
     *
     * @return 景点列表
     */
    @Override
    public List<Attraction> findAll() {
        try {
            return attractionMapper.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

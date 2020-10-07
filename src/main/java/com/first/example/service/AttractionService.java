package com.first.example.service;

import com.first.example.bean.Attraction;
import com.first.example.bean.Hostel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/24 16:35
 */
public interface AttractionService {
    /**
     * 模糊搜索酒店
     * @param keyWord 客户输入的搜索的关键字
     * @return 符合搜索范围的酒店
     */
    List<Attraction> findAttractionsByKey(String keyWord);
    /**
     * 用来推荐出几个酒店
     * @param limit 传入需要查询的界限值
     * @return 返回对应的酒店数据
     */
    List<Attraction> findAttractions(Integer limit);

    /**
     * 查询与景点合作的酒店
     * @param attractionId 景点的id号
     * @return 查询到的酒店列表
     */
    List<Hostel> findHostel(Integer attractionId);
}

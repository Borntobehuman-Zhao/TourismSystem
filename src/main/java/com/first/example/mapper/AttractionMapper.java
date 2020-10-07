package com.first.example.mapper;

import com.first.example.bean.Attraction;
import com.first.example.bean.Hostel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/24 15:46
 */
@Mapper
public interface AttractionMapper {

    /**
     * 模糊搜索景点
     *
     * @param keyWord 客户输入的搜索的关键字
     * @return 符合搜索范围的酒店
     */
    List<Attraction> findAttractionsByKey(@Param("keyWord") String keyWord);

    /**
     * 用来推荐出几个景点
     *
     * @param limit 传入需要查询的界限值
     * @return 返回对应的景点数据
     */
    List<Attraction> findAttractions(@Param("limit") Integer limit);

    /**
     * 查询与景点合作的酒店
     *
     * @param attractionId 景点的id号
     * @return 查询到的酒店列表
     */
    List<Hostel> findHostel(@Param("attractionId") Integer attractionId);


}

package com.first.example.mapper;

import com.first.example.bean.Attraction;
import com.first.example.bean.Hostel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/9/25 13:59
 */
@Mapper
public interface HostelMapper {

    /**
     * 酒店对象
     * @param hostel
     * @return
     */
    public Integer saveHostel(Hostel hostel);

    /**
     * 查询推荐酒店
     * @param limit 给定一个查询界限
     * @return 返回酒店列表
     */
    public List<Hostel> findHostelByLimit(@Param("limit") Integer limit);

    /**
     * 查询与酒店合作的景点
     * @param hostelId 酒店的Id号
     * @return 返回景点列表
     */
    public List<Attraction> findAttractions(@Param("hostelId") Integer hostelId);
}

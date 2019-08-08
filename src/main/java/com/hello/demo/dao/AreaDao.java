package com.hello.demo.dao;

import com.hello.demo.entity.Area;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}

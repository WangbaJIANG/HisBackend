package com.neuedu.his.mapper;

import com.neuedu.his.pojo.RegistLevel;
import com.neuedu.his.pojo.Scheduling;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegistLevelMapper {
    List<RegistLevel> findRegistLevelAll();

    RegistLevel findLevelById(int id);
}

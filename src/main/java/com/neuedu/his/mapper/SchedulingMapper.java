package com.neuedu.his.mapper;


import com.neuedu.his.pojo.Scheduling;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchedulingMapper {
   Scheduling findRuleById(Integer id) ;


}

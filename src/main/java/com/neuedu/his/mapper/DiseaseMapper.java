package com.neuedu.his.mapper;

import com.neuedu.his.pojo.Disease;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DiseaseMapper {
    List<Disease> findDiseaseByCondition(Disease disease);

}

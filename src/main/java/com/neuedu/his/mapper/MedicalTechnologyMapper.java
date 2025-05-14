package com.neuedu.his.mapper;


import com.neuedu.his.pojo.MedicalTechnology;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface MedicalTechnologyMapper {



    List<MedicalTechnology> findMedicalTechnologyByIdAndName(MedicalTechnology medicalTechnology);

}

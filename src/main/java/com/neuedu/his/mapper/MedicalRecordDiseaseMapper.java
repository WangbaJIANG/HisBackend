package com.neuedu.his.mapper;


import com.neuedu.his.pojo.MedicalRecordDisease;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MedicalRecordDiseaseMapper {
  public void saveMedicalDiseaseRecord(MedicalRecordDisease medicalRecordDisease);

}

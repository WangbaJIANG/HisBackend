package com.neuedu.his.mapper;

import com.neuedu.his.pojo.MedicalRecord;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MedicalRecordMapper {
  public Integer saveMedicalRecord(MedicalRecord medicalRecord);
  public  Integer saveDiagnosis(String cure,String diagnosis,Integer registerId);
}

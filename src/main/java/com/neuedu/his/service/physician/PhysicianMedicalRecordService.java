package com.neuedu.his.service.physician;

import com.neuedu.his.pojo.Disease;

import java.util.List;


public interface PhysicianMedicalRecordService {
    List<Disease> findDiseaseByCondition(Disease condition);
}

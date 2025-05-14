package com.neuedu.his.service.impl;

import com.neuedu.his.mapper.DiseaseMapper;
import com.neuedu.his.pojo.Disease;
import com.neuedu.his.service.physician.PhysicianMedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhysicianMedicalRecordServiceImpl implements PhysicianMedicalRecordService {
    @Autowired
    DiseaseMapper diseaseMapper;
    @Override
    public List<Disease> findDiseaseByCondition(Disease disease) {
        return diseaseMapper.findDiseaseByCondition(disease);
    }
}

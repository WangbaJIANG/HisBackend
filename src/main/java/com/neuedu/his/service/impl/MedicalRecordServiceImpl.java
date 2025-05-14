package com.neuedu.his.service.impl;

import com.neuedu.his.mapper.MedicalRecordDiseaseMapper;
import com.neuedu.his.mapper.MedicalRecordMapper;
import com.neuedu.his.pojo.MedicalRecord;
import com.neuedu.his.pojo.MedicalRecordDisease;
import com.neuedu.his.service.physician.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {
    @Autowired
    MedicalRecordMapper medicalRecordMapper;

    @Autowired
    MedicalRecordDiseaseMapper medicalRecordDiseaseMapper;

    @Override
    @Transactional
    public void saveMedicalRecord(MedicalRecord medicalRecord) {
      medicalRecordMapper.saveMedicalRecord(medicalRecord);

        for(int diseaseIds:medicalRecord.getDiseaseIds()){

            MedicalRecordDisease medicalRecordDisease=new MedicalRecordDisease();

            medicalRecordDisease.setDiseaseId(diseaseIds);

            medicalRecordDisease.setMedicalRecordId(medicalRecord.getId());
            medicalRecordDiseaseMapper.saveMedicalDiseaseRecord(medicalRecordDisease);
        }

    }
}

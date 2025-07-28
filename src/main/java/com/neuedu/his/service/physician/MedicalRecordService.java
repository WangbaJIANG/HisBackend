package com.neuedu.his.service.physician;

import com.neuedu.his.pojo.MedicalRecord;

public interface MedicalRecordService {
    void saveMedicalRecord(MedicalRecord medicalRecord);
      Integer saveDiagnosis(String cure,String diagnosis,Integer registerId);
}

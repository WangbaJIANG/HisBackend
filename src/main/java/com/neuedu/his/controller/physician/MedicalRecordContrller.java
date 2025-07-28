package com.neuedu.his.controller.physician;

import com.neuedu.his.pojo.MedicalRecord;
import com.neuedu.his.service.physician.MedicalRecordService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/physician")

public class MedicalRecordContrller {

    @Autowired
    MedicalRecordService medicalRecordService;

    @RequestMapping("/saveMedicalRecord")

    public Result saveMedicalRecord(@RequestBody MedicalRecord medicalRecord)
    {


        medicalRecordService.saveMedicalRecord(medicalRecord);
        return Result.ok();
    }
    @RequestMapping("/saveDiagnosis")
    public Result saveDiagnosis(String cure,String diagnosis,Integer registerId)
    {medicalRecordService.saveDiagnosis(cure,diagnosis,registerId);
        return Result.ok();
    }
}

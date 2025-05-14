package com.neuedu.his.controller.physician;


import com.neuedu.his.pojo.Disease;
import com.neuedu.his.service.physician.PhysicianMedicalRecordService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/phycisian")
public class PhysicianMedicalRecordController {
    @Autowired
    PhysicianMedicalRecordService physicianMedicalRecordService;
    @RequestMapping("/findDiseaseByCondition")
    public Result findDiseaseByCondition(@RequestBody Disease disease){

    return Result.ok(physicianMedicalRecordService.findDiseaseByCondition(disease));
    }
}

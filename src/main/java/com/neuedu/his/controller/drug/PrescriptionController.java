package com.neuedu.his.controller.drug;

import com.neuedu.his.pojo.Prescription;
import com.neuedu.his.service.Drug.DrugService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
    @RequestMapping("/prescription")
public class PrescriptionController {

@Autowired
    DrugService drugService;


@RequestMapping("/findDrugByNameAndCode")
    Result findDrugByNameAndCode(String drugName,String mnemonicCode){
    return Result.ok(drugService.findDrugByNameAndCode(drugName,mnemonicCode));
}


@RequestMapping("/saveDrugPrescription")
    Result saveDrugPrescription(@RequestBody List<Prescription> prescriptions){
    for (Prescription prescription:prescriptions){
        System.out.println(prescription);
    }
    return Result.ok(drugService.saveDrugPrescription(prescriptions));
}
@RequestMapping("/findPatientByNameAndCase")
    Result findPatientByNameAndCase(String realName,String caseNumber,Integer pageNum,Integer pageSize){


    return  Result.ok(drugService.findPatientByNameAndCase(realName,caseNumber,pageNum,pageSize));




}
    @RequestMapping("/findPatientWithDrug")
    Result findPatientWithDrug(String realName,String caseNumber){
        return Result.ok(drugService.findPatientWithDrug(realName,caseNumber));
    }
    @RequestMapping("/findDrugWithRegisterId")
    Result  findDrugWithRegisterId(Integer registerId){
    return  Result.ok(drugService.findDrugWithRegisterId(registerId));



    }
    @RequestMapping("/sendDrug")
    Result sendDrug(Integer registerId,Integer drugId,String drugState){
    return Result.ok(drugService.sendDrug(registerId,drugId,drugState));
    }

}

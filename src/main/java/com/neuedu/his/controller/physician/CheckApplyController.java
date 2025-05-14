package com.neuedu.his.controller.physician;

import com.neuedu.his.service.check.CheckApplyService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/checkApply")
public class CheckApplyController {

    @Autowired
    CheckApplyService checkApplyService;
    @RequestMapping("/findfinishPatientCount")
    Result findfinishPatientCount (String state){
        return Result.ok(checkApplyService.findfinishPatientCount(state));
    }
    @RequestMapping("/findPatient")
    Result findPatient (Integer pageNum,Integer pageSize,String caseNumber,String realName){
        return Result.ok(checkApplyService.findPatient(pageNum,pageSize,caseNumber,realName));
    }
    @RequestMapping("/patientCheckApply")
    Result patientCheckApply(Integer id,String state){
        checkApplyService.patientCheckApply(id,state);

        return Result.ok();
    }
    @RequestMapping("/findCheckList")
    Result findCheckList(Integer registerId){
      return Result.ok(  checkApplyService.findCheckList(registerId));
    }
}

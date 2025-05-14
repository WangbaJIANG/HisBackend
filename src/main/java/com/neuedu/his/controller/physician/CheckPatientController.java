package com.neuedu.his.controller.physician;

import com.neuedu.his.pojo.Register;
import com.neuedu.his.service.check.CheckApplyService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/checkPatient")
public class CheckPatientController {
    @Autowired
    CheckApplyService checkApplyService;

    @RequestMapping("/findCheckDepartmentByTechType")
    Result findCheckDepartmentByTechType(String techType){
        return Result.ok(checkApplyService.findCheckDepartmentByTechType(techType));

    }

    @RequestMapping("/findDoctorByDeptId")
    Result findDoctorByDeptId(String deptName){
        return Result.ok(checkApplyService.findDoctorByDeptId(deptName));
    }

    @RequestMapping("/checkPatient")
        Result checkPatient(Integer employeeId,Integer techId,Integer id){
        checkApplyService.checkPatient(employeeId,techId,id);
        return Result.ok();
    }
}

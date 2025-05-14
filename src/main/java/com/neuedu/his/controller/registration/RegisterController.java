package com.neuedu.his.controller.registration;

import com.neuedu.his.pojo.Register;
import com.neuedu.his.service.registration.RegisterService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;


    @RequestMapping("/findMaxCaseNumber")
    public Result findMaxCaseNumber(){


    return Result.ok(registerService.findMaxCaseNumber());}

    @RequestMapping("/addRegister")
    public Result addRegister(@RequestBody Register register){



        if ("true".equals(register.getIsBook()))
        {
            register.setIsBook("是");
        }
        else{register.setIsBook("否");}
        registerService.addRegister(register);
        return Result.ok();
    }


    @RequestMapping("/findCountByempIdAndVisitState")
    public Result findCountByempIdAndVisitState(Integer employeeId,Integer state){
        return Result.ok(registerService.findCountByempIdAndVisitState(employeeId,state));
    }

    @RequestMapping("/findPatientByempId")
    public  Result findPatientByempId(Integer pageNum,Integer pageSize,Integer employeeId,String caseNumber,String realName){
        return Result.ok(registerService.findPatientByempId(pageNum,pageSize,employeeId,caseNumber,realName));
    }
    @RequestMapping("/updateVisitStateById")
    public  Result updateVisitStateById(@RequestBody Register register){
        registerService.updateVisitStateById(register);
    return   Result.ok();
    }

    @RequestMapping("findPatientByempId1")
    public  Result findPatientByempId1(Integer pageNum,Integer pageSize,Integer employeeId,String caseNumber,String realName){
        registerService.findPatientByempId1( pageNum,pageSize, employeeId, caseNumber, realName);
        return Result.ok();
    }
}

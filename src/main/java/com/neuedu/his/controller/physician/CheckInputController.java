package com.neuedu.his.controller.physician;

import com.neuedu.his.service.check.CheckApplyService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/checkInput")
@CrossOrigin
@RestController
public class CheckInputController {

    @Autowired
    CheckApplyService checkApplyService;


    @RequestMapping("/findInputPatient")
    Result findInputPatient(String caseNumber,String realName,String checkState ){

        return Result.ok(checkApplyService.findInputPatient(realName,caseNumber,checkState));
    }
    @RequestMapping("/findInputCheck")
    Result findInputCheck(Integer registerId){
        return Result.ok(checkApplyService.findInputCheck(registerId));
    }
}

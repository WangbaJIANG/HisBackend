package com.neuedu.his.controller.registration;


import com.neuedu.his.pojo.CheckRequest;
import com.neuedu.his.pojo.vo.ExpenseChargeVo;
import com.neuedu.his.service.registration.ExpenseChargeService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/expenseCharge")
public class ExpenseChargeController {

    @Autowired
    ExpenseChargeService expenseChargeService;
    @RequestMapping("/findPatientByCondition")
    Result findPatientByCondition(String caseNumber, String realName){


    return Result.ok(expenseChargeService.findPatientByCondition(caseNumber,realName));}

    @RequestMapping("/expenseCharge")
    Result expenseChange(@RequestBody List<ExpenseChargeVo> requestData)
    {
      expenseChargeService.expenseCharge(requestData);
        return Result.ok();
    }
}

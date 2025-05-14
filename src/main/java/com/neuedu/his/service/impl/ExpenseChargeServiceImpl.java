package com.neuedu.his.service.impl;

import com.neuedu.his.mapper.CheckRequestMapper;
import com.neuedu.his.mapper.RegisterMapper;
import com.neuedu.his.pojo.Register;
import com.neuedu.his.service.registration.ExpenseChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neuedu.his.pojo.vo.ExpenseChargeVo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ExpenseChargeServiceImpl implements ExpenseChargeService {

    @Autowired
    RegisterMapper registerMapper;

    @Autowired
    CheckRequestMapper checkRequestMapper;


    public Register findPatientByCondition(String caseNumber, String realName) {


        Register patient=registerMapper.findPatientByCondition(caseNumber,realName);
        List<ExpenseChargeVo> expenseChargeVoList=checkRequestMapper.findCheckRequestByRegisterId(patient.getId());
        System.out.println(expenseChargeVoList+"nibuhao");
        patient.setVoList(expenseChargeVoList);
        return patient;

    }

    @Override
    public int expenseCharge( List<ExpenseChargeVo> requestData) {
        System.out.println(requestData+"nihaoaa");
        for (ExpenseChargeVo ec:requestData){
            System.out.println(ec+"test");
                 checkRequestMapper.updateStateById(ec.getId(),"已缴费");

        }

        return 0;
    }


}

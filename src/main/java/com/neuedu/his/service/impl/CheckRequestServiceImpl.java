package com.neuedu.his.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.his.mapper.CheckRequestMapper;
import com.neuedu.his.pojo.CheckRequest;
import com.neuedu.his.pojo.Register;
import com.neuedu.his.service.physician.CheckRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CheckRequestServiceImpl implements CheckRequestService {

    @Autowired
    CheckRequestMapper checkRequestMapper;

    @Override
    public void addCheckRequest(CheckRequest checkRequest) {

        System.out.println(checkRequest+"nihao ");
        Date date=new Date();
        checkRequest.setCreationTime(date);
        for(int techId:checkRequest.getTechIds()){

            System.out.println(checkRequest);
            checkRequest.setMedicalTechnologyId(techId);
            checkRequestMapper.addCheckRequest(checkRequest);

        }


    }




}

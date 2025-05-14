package com.neuedu.his.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.his.mapper.RegisterMapper;
import com.neuedu.his.pojo.Register;
import com.neuedu.his.service.registration.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterMapper registerMapper;
    @Override
    public String findMaxCaseNumber() {
        return registerMapper.findMaxCaseNumber();
    }

    @Override
    public void addRegister(Register register) {
        registerMapper.saveRegister(register);
    }
    public Integer findCountByempIdAndVisitState(Integer employeeId,Integer state){
        Register register=new Register();
        register.setEmployeeId(employeeId);
        register.setVisitState(state);
        return registerMapper.findCountByempIdAndVisitState(register);
    }

    public PageInfo<Register> findPatientByempId(Integer pageNum,Integer pageSize,Integer employeeId,String caseNumber,String realName){
        Register register =new Register();
        //封装分页数据
        PageHelper.startPage(pageNum,pageSize);
        //查询数据

        register.setEmployeeId(employeeId);
        register.setCaseNumber(caseNumber);
        register.setRealName(realName);
        List<Register> registerList = registerMapper.findPatientByempId(register);
        PageInfo<Register>pageInfo=new PageInfo<>(registerList);
        return pageInfo;
    }

    @Override
    public void updateVisitStateById(Register register) {
        System.out.println("nihao"+register);
      registerMapper.updateVisitStateById(register);
    }



    public Register findPatientByCondition (String caseNumber,String realName){
        return registerMapper.findPatientByCondition(caseNumber,realName);
    }
    public PageInfo<Register> findPatientByempId1(Integer pageNum,Integer pageSize,Integer employeeId,String caseNumber,String realName){
        Register register =new Register();
        //封装分页数据
        PageHelper.startPage(pageNum,pageSize);
        //查询数据

        register.setEmployeeId(employeeId);
        register.setCaseNumber(caseNumber);
        register.setRealName(realName);
        List<Register> registerList = registerMapper.findPatientByempId(register);
        PageInfo<Register>pageInfo=new PageInfo<>(registerList);
        return pageInfo;
    }
}

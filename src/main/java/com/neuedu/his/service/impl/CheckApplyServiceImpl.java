package com.neuedu.his.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.his.mapper.CheckRequestMapper;
import com.neuedu.his.pojo.*;
import com.neuedu.his.service.check.CheckApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CheckApplyServiceImpl implements CheckApplyService {

    @Autowired
    CheckRequestMapper checkRequestMapper;

    @Override
    public Integer findfinishPatientCount(String state) {
        return checkRequestMapper.findPatientCount(state);
    }

    @Override
    public PageInfo<Register> findPatient(Integer pageNum, Integer pageSize, String caseNumber, String realName) {

        List<Register> registerList = checkRequestMapper.findPatient(caseNumber, realName);
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<Register>pageInfo=new PageInfo<Register>(registerList);

        return pageInfo;

    }

    @Override
    public void patientCheckApply(Integer id,String state) {
    checkRequestMapper.updateStateById(id,state);
    }

    @Override
    public List<MedicalTechnology> findCheckList(Integer registerId) {

        return checkRequestMapper.findCheckList(registerId);
    }

    @Override
    public List<Departement> findCheckDepartmentByTechType(String techType) {
        return checkRequestMapper.findCheckDepartmentByTechType(techType);
    }

    @Override
    public List<Employee> findDoctorByDeptId(String deptName) {
        return checkRequestMapper.findDoctorByDeptId(deptName);
    }


    @Override
    public void checkPatient(Integer employeeId, Integer techId, Integer id,
                             Date checkTime, Integer checkEmployeeId, String checkInfo,
                             String checkPosition, Integer inputcheckEmployeeId, String checkRemark,String checkState,String checkResult) {
        checkRequestMapper.checkPatient(employeeId,techId,id,checkTime,checkEmployeeId,checkInfo,
                checkPosition,inputcheckEmployeeId,checkRemark,checkState,checkResult);
    }

    @Override
    public List<Register> findInputPatient(String realName, String caseNumber,String checkState) {

        return checkRequestMapper.findInputPatient(realName,caseNumber,checkState);
    }

    @Override
    public List<MedicalTechnology> findInputCheck(Integer registerId) {
        return checkRequestMapper.findInputCheck(registerId);
    }

    @Override
    public List<MedicalTechnology> findCheckListAll(Integer registerId) {

        return checkRequestMapper.findCheckListAll(registerId);
    }

    @Override
    public CheckRequest findCheckRequestByRegisterIdAll(Integer registerId, Integer techId) {
        return checkRequestMapper.findCheckRequestByRegisterIdAll(registerId,techId);
    }

}

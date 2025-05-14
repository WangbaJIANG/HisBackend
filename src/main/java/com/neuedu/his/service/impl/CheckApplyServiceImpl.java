package com.neuedu.his.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.his.mapper.CheckRequestMapper;
import com.neuedu.his.pojo.Departement;
import com.neuedu.his.pojo.Employee;
import com.neuedu.his.pojo.MedicalTechnology;
import com.neuedu.his.pojo.Register;
import com.neuedu.his.service.check.CheckApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void checkPatient(Integer employeeId, Integer techId, Integer id) {

        checkRequestMapper.checkPatient(employeeId,techId,id);
    }

}

package com.neuedu.his.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.his.mapper.DrugMapper;
import com.neuedu.his.pojo.Drug;
import com.neuedu.his.pojo.Prescription;
import com.neuedu.his.pojo.Register;
import com.neuedu.his.service.Drug.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {

@Autowired
DrugMapper drugMapper;
    @Override
    public List<Drug> findDrugByNameAndCode(String drugName, String mnemonicCode) {
        return drugMapper.findDrugByNameAndCode(drugName,mnemonicCode);
    }

    @Override
    public int saveDrugPrescription(List<Prescription> prescriptions) {
       for (Prescription prescription:prescriptions){
           drugMapper.saveDrugPrescription(prescription);
       }
        return 0;
    }

    @Override
    public PageInfo<Register> findPatientByNameAndCase(String realName, String caseNumber,Integer pageNum,Integer pageSize) {
        List<Register>registerList= drugMapper.findPatientByNameAndCase(realName,caseNumber);
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<Register>pageInfo=new PageInfo<Register>(registerList);

        return pageInfo;
    }

    @Override
    public List<Register> findPatientWithDrug(String realName, String caseNumber) {
        return drugMapper.findPatientWithDrug(realName,caseNumber);
    }

    @Override
    public List<Drug> findDrugWithRegisterId(Integer registerId) {
        return drugMapper.findDrugWithRegisterId(registerId);
    }

    @Override
    public int sendDrug(Integer registerId, Integer drugId,String drugState) {
        drugMapper.sendDrug(registerId,drugId,drugState);
        return 0;
    }

}

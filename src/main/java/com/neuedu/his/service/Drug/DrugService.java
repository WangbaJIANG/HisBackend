package com.neuedu.his.service.Drug;

import com.github.pagehelper.PageInfo;
import com.neuedu.his.pojo.Drug;
import com.neuedu.his.pojo.Prescription;
import com.neuedu.his.pojo.Register;

import java.util.List;


public interface DrugService {
    public List<Drug> findDrugByNameAndCode(String  drugName, String mnemonicCode);


    int saveDrugPrescription(List<Prescription> Prescription);

    PageInfo<Register> findPatientByNameAndCase(String realName, String caseNumber,Integer pageNum,Integer pageSize);

    List<Register> findPatientWithDrug(String realName, String caseNumber);

    List<Drug> findDrugWithRegisterId(Integer registerId);

    int sendDrug(Integer registerId, Integer drugId,String drugState);
}

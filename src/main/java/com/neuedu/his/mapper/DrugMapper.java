package com.neuedu.his.mapper;

import com.neuedu.his.pojo.Drug;
import com.neuedu.his.pojo.Prescription;
import com.neuedu.his.pojo.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugMapper {
    public List<Drug> findDrugByNameAndCode(String  drugName, String mnemonicCode);


    void saveDrugPrescription(Prescription prescription);
    List<Register> findPatientByNameAndCase(String realName, String caseNumber);

    List<Register> findPatientWithDrug(String realName, String caseNumber);

    List<Drug> findDrugWithRegisterId(Integer registerId);

    int  sendDrug(Integer registerId, Integer drugId,String drugState);
}

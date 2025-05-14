package com.neuedu.his.service.registration;

import com.github.pagehelper.PageInfo;
import com.neuedu.his.pojo.Register;

import java.util.List;

public interface RegisterService {

    String findMaxCaseNumber();

    void addRegister(Register register);
    Integer findCountByempIdAndVisitState(Integer employeeId,Integer state);
    PageInfo<Register> findPatientByempId(Integer current, Integer page, Integer employeeId, String caseNumber, String realName);
    void updateVisitStateById(Register register);
    Register findPatientByCondition (String caseNumber,String realName);
    PageInfo<Register> findPatientByempId1(Integer current, Integer page, Integer employeeId, String caseNumber, String realName);

}

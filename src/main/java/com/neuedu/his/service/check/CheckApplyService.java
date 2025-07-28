package com.neuedu.his.service.check;

import com.github.pagehelper.PageInfo;
import com.neuedu.his.pojo.*;

import java.util.Date;
import java.util.List;

public interface CheckApplyService {
    Integer findfinishPatientCount(String state);
    PageInfo<Register> findPatient(Integer pageNum, Integer pageSize, String caseNumber, String realName);

    void patientCheckApply(Integer id,String state);
    List<MedicalTechnology> findCheckList(Integer registerId);
    List<Departement> findCheckDepartmentByTechType(String techType);
    List<Employee> findDoctorByDeptId(String deptName);

    void checkPatient(Integer employeeId, Integer techId, Integer id,
                      Date checkTime, Integer checkEmployeeId, String checkInfo,
                      String  checkPosition, Integer inputcheckEmployeeId, String checkRemark,String checkState,String checkResult);


    List<Register>findInputPatient(String realName,String caseNumber,String checkState);
    List<MedicalTechnology>findInputCheck(Integer registerId);

    List<MedicalTechnology> findCheckListAll(Integer registerId);

    CheckRequest findCheckRequestByRegisterIdAll(Integer registerId, Integer techId);
}

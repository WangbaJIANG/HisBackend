package com.neuedu.his.mapper;

import com.neuedu.his.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import com.neuedu.his.pojo.vo.ExpenseChargeVo;

import java.util.Date;
import java.util.List;

@Mapper
public interface CheckRequestMapper {

public void addCheckRequest(CheckRequest checkRequest);

    List<ExpenseChargeVo> findCheckRequestByRegisterId(Integer registerId);
    Integer updateStateById(int id,String state);
    Integer findPatientCount(String state);
    List<Register> findPatient(String caseNumber,String realName);
    void patientCheckApply(Integer id);
    List<MedicalTechnology> findCheckList(Integer registerId);
    List<Departement>findCheckDepartmentByTechType(String techType);
    List<Employee> findDoctorByDeptId(String deptName);

    void checkPatient( Integer employeeId, Integer techId, Integer id,
                      Date checkTime,Integer checkEmployeeId,String checkInfo,
                      String  checkPosition,Integer inputcheckEmployeeId,String checkRemark,String checkState,String checkResult);

    List<Register>findInputPatient(String realName,String caseNumber,String checkState);
    List<MedicalTechnology>findInputCheck(Integer registerId);


    List<MedicalTechnology> findCheckListAll(Integer registerId);
    CheckRequest findCheckRequestByRegisterIdAll(Integer registerId, Integer techId);
}

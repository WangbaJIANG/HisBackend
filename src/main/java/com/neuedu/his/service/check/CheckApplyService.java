package com.neuedu.his.service.check;

import com.github.pagehelper.PageInfo;
import com.neuedu.his.pojo.Departement;
import com.neuedu.his.pojo.Employee;
import com.neuedu.his.pojo.MedicalTechnology;
import com.neuedu.his.pojo.Register;

import java.util.List;

public interface CheckApplyService {
    Integer findfinishPatientCount(String state);
    PageInfo<Register> findPatient(Integer pageNum, Integer pageSize, String caseNumber, String realName);

    void patientCheckApply(Integer id,String state);
    List<MedicalTechnology> findCheckList(Integer registerId);
    List<Departement> findCheckDepartmentByTechType(String techType);
    List<Employee> findDoctorByDeptId(String deptName);
    void checkPatient(Integer employeeId,Integer techId,Integer id);

}

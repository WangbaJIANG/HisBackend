package com.neuedu.his.service.registration;

import com.neuedu.his.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findEmpByDeptIdAndLevelId(Employee emp);
    Employee  findEmpByNameAndPsw(String realname,String password);

    Employee findEmpByEmpId(Integer empId);

}

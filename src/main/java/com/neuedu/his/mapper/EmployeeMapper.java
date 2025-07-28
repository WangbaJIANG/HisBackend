package com.neuedu.his.mapper;

import com.neuedu.his.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> findEmpByDeptIdAndLevelId(Employee emp) ;
    Employee findEmpByNameAndPsw(Employee employee);


    Employee findEmpByEmpId(Integer empId);
}

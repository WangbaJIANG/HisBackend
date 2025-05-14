package com.neuedu.his.controller.registration;

import com.neuedu.his.pojo.Employee;
import com.neuedu.his.service.registration.EmployeeService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RequestMapping("/employee")
@RestController

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/findEmpByDeptIdAndLevelId")
    public Result findEmpByDeptIdAndLevelId(Employee emp){

        return Result.ok(employeeService.findEmpByDeptIdAndLevelId(emp));

    }

}

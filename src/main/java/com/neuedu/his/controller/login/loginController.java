package com.neuedu.his.controller.login;

import com.neuedu.his.pojo.Employee;
import com.neuedu.his.service.registration.EmployeeService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class loginController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/login")
    public Result login(String realname,String password){
        Employee emp = employeeService.findEmpByNameAndPsw(realname, password);
        if (emp!=null){
            return Result.ok(emp);
        }
        else{
            return Result.build(400,"用户名或密码错误");
        }

    }


}

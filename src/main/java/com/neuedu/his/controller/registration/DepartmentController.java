package com.neuedu.his.controller.registration;

import com.neuedu.his.service.registration.DepartmentService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/findDeptAll")
    public Result findDeptAll(){
        return Result.ok(departmentService.findDeptAll());
    }
}

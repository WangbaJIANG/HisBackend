package com.neuedu.his.service.impl;

import com.neuedu.his.mapper.DepartmentMapper;
import com.neuedu.his.pojo.Departement;
import com.neuedu.his.service.registration.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl  implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Departement> findDeptAll() {
        return departmentMapper.findDeptAll();
    }
}

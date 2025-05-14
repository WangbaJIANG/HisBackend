package com.neuedu.his.service.impl;

import com.neuedu.his.mapper.EmployeeMapper;
import com.neuedu.his.mapper.PermitMapper;
import com.neuedu.his.mapper.SchedulingMapper;
import com.neuedu.his.pojo.Employee;
import com.neuedu.his.pojo.Permit;
import com.neuedu.his.pojo.Scheduling;
import com.neuedu.his.service.registration.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private SchedulingMapper schedulingMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    PermitMapper   permitMapper;

    @Override
    public List<Employee> findEmpByDeptIdAndLevelId(Employee emp){
       List<Employee> empList=employeeMapper.findEmpByDeptIdAndLevelId(emp);
       List<Employee> resultList=new ArrayList<>();

       for(Employee employee:empList){
           int id =employee.getSchedulingId();
           Scheduling rule=schedulingMapper.findRuleById(id);
           Calendar cal=Calendar.getInstance();
           int week=cal.get(Calendar.DAY_OF_WEEK);
           int ampm=cal.get(Calendar.AM_PM);
           int index=(week-1)*2+ampm;
           char temp=rule.getWeekRule().charAt(index);
           if (temp=='1'){
            resultList.add(employee);

           }
       }

        return resultList ;

    }

    @Override
    public Employee findEmpByNameAndPsw(String realname, String password) {
      Employee employee =new Employee();
      employee.setRealname(realname);
      employee.setPassword(password);
        Employee emp = employeeMapper.findEmpByNameAndPsw(employee);
        for(Permit permit: emp.getPermitList()){
            List<Permit> children = permitMapper.findChildrenByParentId(permit.getId());
            permit.setChildren(children);

        }
            //当前一级权限关联的二级权限
        return emp;

        }

}

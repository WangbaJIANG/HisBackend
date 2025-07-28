package com.neuedu.his.mapper;


import com.neuedu.his.pojo.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegisterMapper {

    //查询所有部门 四个一致四个一致mapper接口的名字和mapper映射文件的名字 方法名和statement的Id一致 方法的参数和输入参数一致 方法的返回值和输出参数一致
    String findMaxCaseNumber();


    void saveRegister(Register register);
    Integer findCountByempIdAndVisitState(Register register);
    List<Register> findPatientByempId(Register register);
    void updateVisitStateById(Integer id,Integer state);


    void updateVisitStateById(Register register);

    Register findPatientByCondition(String caseNumber, String realName);
    Register findPatientByempId1(Register register);
    List<Register> findPatientByempIdAndState(Register register);
}

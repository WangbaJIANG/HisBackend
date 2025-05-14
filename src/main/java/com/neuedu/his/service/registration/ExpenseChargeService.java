package com.neuedu.his.service.registration;


import com.neuedu.his.pojo.Register;
import com.neuedu.his.pojo.vo.ExpenseChargeVo;

import java.util.List;

public interface ExpenseChargeService {

    public Register findPatientByCondition(String caseNumber, String realName);

    public  int expenseCharge(List<ExpenseChargeVo> expenseChargeVoList);
}

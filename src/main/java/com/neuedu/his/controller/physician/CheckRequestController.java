package com.neuedu.his.controller.physician;

import com.neuedu.his.pojo.CheckRequest;
import com.neuedu.his.pojo.MedicalTechnology;
import com.neuedu.his.pojo.Register;
import com.neuedu.his.service.physician.CheckRequestService;
import com.neuedu.his.service.physician.MedicalTechnologyService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/checkRequest")
public class CheckRequestController {

    @Autowired
    MedicalTechnologyService medicalTechnologyService;

    @Autowired
    CheckRequestService checkRequestService;
    @RequestMapping("/findMedicalTechnologyByIdAndName")
    Result findMedicalTechnologyByIdAndName(@RequestBody MedicalTechnology medicalTechnology)
    {
        return Result.ok(medicalTechnologyService.findMedicalTechnologyByIdAndName(medicalTechnology));
    }


    @RequestMapping("/addCheckRequest")
    Result addCheckRequest (@RequestBody CheckRequest checkRequest){
        checkRequestService.addCheckRequest(checkRequest);
        System.out.println(checkRequest+"nihao");
        return Result.ok();
    }


}

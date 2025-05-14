package com.neuedu.his.controller.registration;

import com.neuedu.his.service.registration.RegistLevelService;
import com.neuedu.his.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/registLevel")
public class RegistLevelController {

    @Autowired
    RegistLevelService registLevelService;

    @RequestMapping("/findRegistLevelAll")
    Result findRegistLevelAll(){
        return Result.ok(registLevelService.findRegistLevelAll());
    }

    @RequestMapping("/findLevelById")
    Result findLevelById(int id){
        return Result.ok(registLevelService.findLevelById(id));
    }
}

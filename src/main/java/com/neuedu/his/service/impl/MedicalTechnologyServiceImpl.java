package com.neuedu.his.service.impl;

import com.neuedu.his.mapper.MedicalTechnologyMapper;
import com.neuedu.his.pojo.MedicalTechnology;
import com.neuedu.his.service.physician.MedicalTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicalTechnologyServiceImpl implements MedicalTechnologyService {

@Autowired
MedicalTechnologyMapper medicalTechnologyMapper;

    @Override
    public List<MedicalTechnology> findMedicalTechnologyByIdAndName(MedicalTechnology medicalTechnology) {
        return medicalTechnologyMapper.findMedicalTechnologyByIdAndName(medicalTechnology) ;
    }


}

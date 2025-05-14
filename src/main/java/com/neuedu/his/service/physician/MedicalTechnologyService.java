package com.neuedu.his.service.physician;

import com.neuedu.his.pojo.MedicalTechnology;

import java.util.List;

public interface MedicalTechnologyService {
    List<MedicalTechnology> findMedicalTechnologyByIdAndName(MedicalTechnology medicalTechnology);

}

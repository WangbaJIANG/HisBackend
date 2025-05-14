package com.neuedu.his.service.registration;

import com.neuedu.his.pojo.RegistLevel;

import java.util.List;

public interface RegistLevelService {

    List<RegistLevel> findRegistLevelAll();

    RegistLevel findLevelById(int id);
}

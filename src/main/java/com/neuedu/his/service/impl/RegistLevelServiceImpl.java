package com.neuedu.his.service.impl;

import com.neuedu.his.mapper.RegistLevelMapper;
import com.neuedu.his.pojo.RegistLevel;
import com.neuedu.his.service.registration.RegistLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegistLevelServiceImpl implements RegistLevelService {

    @Autowired
   private RegistLevelMapper registLevelMapper;
    @Override
    public List<RegistLevel> findRegistLevelAll() {
        return registLevelMapper.findRegistLevelAll();

    }

    @Override
    public RegistLevel findLevelById(int id) {
        return registLevelMapper.findLevelById(id);
    }
}

package com.neuedu.his.mapper;

import com.neuedu.his.pojo.Permit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermitMapper {
    List<Permit> findChildrenByParentId(Integer parentId);


}

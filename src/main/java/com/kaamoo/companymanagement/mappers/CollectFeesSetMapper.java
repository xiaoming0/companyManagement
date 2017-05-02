package com.kaamoo.companymanagement.mappers;

import com.kaamoo.companymanagement.entity.CollectFeesSet;

public interface CollectFeesSetMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CollectFeesSet record);

    int insertSelective(CollectFeesSet record);

    CollectFeesSet selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CollectFeesSet record);

    int updateByPrimaryKey(CollectFeesSet record);
}
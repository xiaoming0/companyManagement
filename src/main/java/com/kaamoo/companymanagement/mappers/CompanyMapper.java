package com.kaamoo.companymanagement.mappers;

import com.kaamoo.companymanagement.entity.Company;
import com.kaamoo.companymanagement.entity.CompanyWithBLOBs;
import com.kaamoo.companymanagement.transmit.Result;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CompanyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CompanyWithBLOBs record);

    int insertSelective(CompanyWithBLOBs record);

    CompanyWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CompanyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompanyWithBLOBs record);

    int updateByPrimaryKey(Company record);


    Company selectByCompanyName(@Param("companyName") String companyName);

    Company selectByAbbreviation(@Param("abbreviation") String abbreviation);

    Company selectByFilialeAppKey(@Param("filialeAppKey") String filialeAppKey);


    List<Company> selectByParam(@Param("param") String param,@Param("appKey")String appKey, @Param("offset")Long offset, @Param("limit")Long limit);

    Long countByParam(@Param("param")String param,@Param("appKey")String appKey);

   List<Company> simpleQueryCompany(@Param("appKey") String appKey);

    CompanyWithBLOBs selectByIdAndAppKey(@Param("companyId") Long companyId, @Param("appKey") String appKey);

    int updateByIdAndAppKeySelective(@Param("company") Company company, @Param("appKey")String appKey);
}
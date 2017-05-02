package com.kaamoo.companymanagement.service;

import com.kaamoo.companymanagement.entity.Company;
import com.kaamoo.companymanagement.entity.CompanyWithBLOBs;
import com.kaamoo.companymanagement.transmit.PageData;
import com.kaamoo.companymanagement.transmit.Result;

import java.util.List;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public interface CompanyService {
    CompanyWithBLOBs create(CompanyWithBLOBs companyWithBLOBs);

    Company findByCompanyName(String companyname);

    Company findByAbbreviation(String abbreviation);

    Company findByFilialeAppKey(String filialeAppKey);

    PageData<Company> findByParam(String param,String appKey, Long offset, Long limit);

    Result<List<Company>> simpleQueryCompany(String appKey);

    Result<CompanyWithBLOBs> findById(Long companyId, String appKey);

    Result<Company> edit(Company company,String appKey);
}

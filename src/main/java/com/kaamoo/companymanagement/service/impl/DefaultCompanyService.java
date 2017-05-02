package com.kaamoo.companymanagement.service.impl;

import com.kaamoo.companymanagement.entity.Company;
import com.kaamoo.companymanagement.entity.CompanyWithBLOBs;
import com.kaamoo.companymanagement.mappers.CompanyMapper;
import com.kaamoo.companymanagement.service.CompanyService;
import com.kaamoo.companymanagement.transmit.PageData;
import com.kaamoo.companymanagement.transmit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/4/17 0017.
 */

@Service
public class DefaultCompanyService implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public CompanyWithBLOBs create(CompanyWithBLOBs companyWithBLOBs) {
        companyMapper.insertSelective(companyWithBLOBs);
        return companyWithBLOBs;
    }

    @Override
    public Company findByCompanyName(String companyname) {
        return companyMapper.selectByCompanyName(companyname);
    }

    @Override
    public Company findByAbbreviation(String abbreviation) {
        return companyMapper.selectByAbbreviation(abbreviation);
    }

    @Override
    public Company findByFilialeAppKey(String filialeAppKey) {
        return companyMapper.selectByFilialeAppKey(filialeAppKey);
    }

    @Override
    public PageData<Company> findByParam(String param,String appKey, Long offset, Long limit) {
        List<Company> list = companyMapper.selectByParam(StringUtils.isEmpty(param)? null : "%"+param+"%",appKey,offset,limit);
        Long total = companyMapper.countByParam(StringUtils.isEmpty(param)? null : "%"+param+"%",appKey);
        PageData<Company> data = new PageData<>();
        data.setRows(list);
        data.setTotal(total);
        return data;
    }

    @Override
    public Result<List<Company>> simpleQueryCompany(String appKey) {
        List<Company> companies = companyMapper.simpleQueryCompany(appKey);
        Result<List<Company>> data = new Result<>();
        data.setData(companies);
        data.setSuccess(true);
        return data;
    }

    @Override
    public Result<CompanyWithBLOBs> findById(Long companyId, String appKey) {
        Result<CompanyWithBLOBs> data = new Result<>();
        CompanyWithBLOBs company = companyMapper.selectByIdAndAppKey(companyId,appKey);
        data.setData(company);
        data.setSuccess(true);
        return data;
    }

    @Override
    public Result<Company> edit(Company company,String appKey) {
        int rows = companyMapper.updateByIdAndAppKeySelective(company,appKey);
        Result<Company> result = new Result<>();
        result.setSuccess(true);
        if(rows==0){
            result.setSuccess(false);
            result.setMessage("修改失败");
        }
        return result;
    }
}

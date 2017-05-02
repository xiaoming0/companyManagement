package com.kaamoo.companymanagement.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kaamoo.companymanagement.entity.Company;
import com.kaamoo.companymanagement.entity.CompanyWithBLOBs;
import com.kaamoo.companymanagement.service.CompanyService;
import com.kaamoo.companymanagement.transmit.PageData;
import com.kaamoo.companymanagement.transmit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.kaamoo.companymanagement.util.CommonUtil.response;


/**
 * Created by Administrator on 2017/4/17 0017.
 */

@RestController
@RequestMapping("company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    private Gson gson =  new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();



    @GetMapping("list")
    public PageData<Company> list(
            @RequestParam("offset")Long offset,
            @RequestParam("limit")Long limit,
            @RequestParam("appKey")String appKey,
            String param){

        return companyService.findByParam(param,appKey,offset,limit);
    }

    @PostMapping("save")
    public Result<Company> save(
            @RequestParam("data")String data,
            @RequestParam("appKey")String appKey){
        CompanyWithBLOBs companyWithBLOBs = gson.fromJson(data, CompanyWithBLOBs.class);
        companyWithBLOBs.setAppkey(appKey);
        Result<Company> result = new Result<>();
        result.setSuccess(true);
        Company company = companyService.findByCompanyName(companyWithBLOBs.getCompanyname());
        if(company!= null){
            StringBuilder message = new StringBuilder();
            message.append("公司名字已存在");
            result.setMessage(message.toString());
            result.setSuccess(false);
            return result;
        }
        company = companyService.findByAbbreviation(companyWithBLOBs.getAbbreviation());
        if(company!= null){
            StringBuilder message = new StringBuilder();
            message.append("公司简称已存在");
            result.setMessage(message.toString());
            result.setSuccess(false);
            return result;
        }
        if((!StringUtils.isEmpty(companyWithBLOBs.getFilialeAppKey())) && companyService.findByFilialeAppKey(companyWithBLOBs.getFilialeAppKey()) != null){
            StringBuilder message = new StringBuilder();
            message.append("appKey 已存在");
            result.setMessage(message.toString());
            result.setSuccess(false);
            return result;
        }

        companyWithBLOBs = companyService.create(companyWithBLOBs);
        result.setData(companyWithBLOBs);
        return result;
    }


    @GetMapping("simpleQueryCompany")
    public Result<List<Company>> simpleQueryCompany(
            @RequestParam("appKey")String appKey){
                return companyService.simpleQueryCompany(appKey);
    }

    @GetMapping("findById")
    public Result<CompanyWithBLOBs> findById(
            @RequestParam("companyId")Long companyId,
            @RequestParam("appKey")String appKey){
                return companyService.findById(companyId,appKey);
    }

    @PutMapping("edit")
    public Result<Company> edit(
            @RequestParam("data")String data,
            @RequestParam("appKey") String appKey){
        Company company = gson.fromJson(data, Company.class);
        return companyService.edit(company,appKey);
    }





}

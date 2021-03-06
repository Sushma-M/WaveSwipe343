/*\/**
 * Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 * This software is the confidential and proprietary information of wavemaker-com * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the source code license agreement you entered into with wavemaker.com *\/*/
package com.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.export.ExportOptions;

import com.hrdb.models.query.*;

@Deprecated
public interface HrdbQueryExecutorService_V1 {

    @Deprecated
    public Page<Object> executeNoOfEmployee(Pageable pageable);

    @Deprecated
    public Page<Object> executeSelectedEmployeeID(Pageable pageable, Integer data);

    @Deprecated
    public Page<Object> executeNoOfDepartments(Pageable pageable);

    @Deprecated
    public Page<Object> executeEngineeringEmployees(Pageable pageable);

    @Deprecated
    public Page<Object> executeProfessionalServicesEmployees(Pageable pageable);

    @Deprecated
    public Page<Object> executeSalesEmployees(Pageable pageable);

    @Deprecated
    public Page<Object> executeGeneralAndAdminEmployees(Pageable pageable);

    @Deprecated
    public Page<Object> executeMarketingEmployees(Pageable pageable);

    @Deprecated
    public Page<Object> executeNoOfDepartment(Pageable pageable);

    @Deprecated
    public Page<Object> executeTotalBudget(Pageable pageable);

}
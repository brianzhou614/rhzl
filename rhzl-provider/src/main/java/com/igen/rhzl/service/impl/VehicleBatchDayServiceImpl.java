package com.igen.rhzl.service.impl;

import com.igen.rhzl.dao.VehicleBatchDayMapper;

import com.igen.rhzl.entities.VehicleBatchDay;
import com.igen.rhzl.service.VehicleBatchDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouxinye
 * @Date: 2019/3/15 11:07
 * @Version 1.0
 */
@Service
public class VehicleBatchDayServiceImpl implements VehicleBatchDayService {

    @Autowired
    private VehicleBatchDayMapper vehicleBatchDayMapper;

    @Override
    public VehicleBatchDay getById(Long id) {
        return vehicleBatchDayMapper.getById(id);
    }
}

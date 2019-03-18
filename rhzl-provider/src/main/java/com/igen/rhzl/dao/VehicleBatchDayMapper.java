package com.igen.rhzl.dao;

import com.igen.rhzl.entities.VehicleBatchDay;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @Author: zhouxinye
 * @Date: 2019/3/18 10:33
 * @Version 1.0
 */
@Mapper
@Service
public interface VehicleBatchDayMapper {
    VehicleBatchDay getById(Long id);
}

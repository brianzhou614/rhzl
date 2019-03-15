package com.igen.rhzl.controller;

import com.igen.rhzl.entities.VehicleBatchDay;
import com.igen.rhzl.service.VehicleBatchDayService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhouxinye
 * @Date: 2019/3/15 13:03
 * @Version 1.0
 */
@RestController
@RequestMapping("/report")
public class VehicleBatchDayController {

    final static Logger logger = LoggerFactory.getLogger(VehicleBatchDayController.class);

    @Autowired
    VehicleBatchDayService vehicleBatchDayService;

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/vehicleBatchDay/{id}")
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
    public VehicleBatchDay getVehicleBatchDay(@PathVariable("id") Long id){
        VehicleBatchDay vehicleBatchDay = vehicleBatchDayService.getById(id);
        logger.error("123");
        return vehicleBatchDay;
    }
}

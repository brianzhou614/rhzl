package com.igen.rhzl.web;

import com.igen.rhzl.constant.Config;
import com.igen.rhzl.entities.VehicleBatchDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhouxinye
 * @Date: 2019/3/15 16:13
 * @Version 1.0
 */
@RestController
public class VehicleReportController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/vehicleBatchDay/{id}")
    public VehicleBatchDay getById(@PathVariable("id") Long id){
        VehicleBatchDay batchDay = restTemplate.getForObject(Config.REST_URL_PREFIX + "report/vehicleBatchDay/" + id, VehicleBatchDay.class);
        return batchDay;
    }
}

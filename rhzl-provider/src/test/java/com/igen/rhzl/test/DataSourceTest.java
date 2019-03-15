package com.igen.rhzl.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.igen.rhzl.dao.VehicleBatchDayMapper;
import com.igen.rhzl.entities.VehicleBatchDay;
import com.igen.rhzl.service.VehicleBatchDayService;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zhouxinye
 * @Date: 2019/3/14 17:26
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTest {

    @Autowired
    private VehicleBatchDayMapper vehicleBatchDayMapper;


    @Autowired
    private VehicleBatchDayService vehicleBatchDayService;

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }


    @Test
    public void test() {
        System.out.println("测试中-----------------");
        //VehicleBatchDay byId = vehicleBatchDayMapper.getById(1L);
        //System.out.println(byId);
        VehicleBatchDay byId = vehicleBatchDayService.getById(1L);
        System.out.println(byId);
    }
}

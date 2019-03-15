package com.igen.rhzl.test;

import com.igen.rhzl.controller.VehicleBatchDayController;
import com.igen.rhzl.entities.VehicleBatchDay;
import com.igen.rhzl.service.VehicleBatchDayService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author: zhouxinye
 * @Date: 2019/3/15 14:45
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
//@WebMvcTest(VehicleBatchDayController.class)
@SpringBootTest
public class VehicleBatchDayControllerTest {
/*    @Autowired
    private MockMvc mvc;



    @Test
    public void getOne() throws Exception {
        mvc.perform(get("/report/vehicleBatchDay/1"))
            .andDo(print()).andExpect(status().isOk());
    }*/
    @Autowired
    private VehicleBatchDayService vehicleBatchDayService;
    @Test
    public void testService(){
        VehicleBatchDay byId = vehicleBatchDayService.getById(1L);
        long m = 2139896;
        Assert.assertEquals(m,(long)byId.getSummileage());
        Assert.assertTrue("测试通过",m == byId.getSummileage());
    }
}

package com.igen.rhzl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhouxinye
 * @Date: 2019/3/15 16:17
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}

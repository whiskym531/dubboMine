package com.example.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.providerService;

/**
 * Created by IntelliJ IDEA.
 * Author: warm
 * Date: 2021/3/13
 * Description:
 */
@Service
//@Component
public class providerServiceImpl implements providerService {
    @Override
    public int ok() {
        System.out.println("芜湖！！");
        return 5;
    }
}

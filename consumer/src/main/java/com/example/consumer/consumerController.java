package com.example.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.providerService;

/**
 * Created by IntelliJ IDEA.
 * Author: warm
 * Date: 2021/3/13
 * Description:
 */
@RestController
//@Service
public class consumerController {

    @Reference
    private providerService providerService;
    @RequestMapping(value = "/nice")
    public int pri(){
        int ok = providerService.ok();
        System.out.println(ok);
        System.out.println("111");
        return 1;
    }

}

package com.personal.dubbo.run.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.personal.dubbo.run.spec.DemoService;

/**
 * Created by yf on 2017/5/8.
 */
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "WTF";
    }
}

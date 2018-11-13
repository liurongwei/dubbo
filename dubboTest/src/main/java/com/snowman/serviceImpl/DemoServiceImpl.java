package com.snowman.serviceImpl;

import com.snowman.service.DemoService;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        return "Helle" + name+runtimeMXBean.getName();

    }
}
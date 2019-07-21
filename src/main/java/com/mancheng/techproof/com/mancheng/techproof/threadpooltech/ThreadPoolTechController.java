package com.mancheng.techproof.com.mancheng.techproof.threadpooltech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ThreadPoolTechController {

    @Autowired
    ExecutorServiceDemo executorServiceDemo;

    @RequestMapping(value = "concurrentRequestSimulation",method = RequestMethod.GET)
    public String concurrentHandle() {
        initializeThreadPool();
        return  "concurrent request handle successful!";
    }

    public void initializeThreadPool() {
        //executorServiceDemo.startThreadPool();
        executorServiceDemo.startSingleThreadPool();
    }




}



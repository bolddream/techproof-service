package com.mancheng.techproof.controller;


import com.mancheng.techproof.DynamicInject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringTechnologyController {

    @Autowired
    private DynamicInject dynamicInject;

    @RequestMapping(value = "/injectBean", method = RequestMethod.GET)
    public String injectBean() {
        dynamicInject.injectBean();
        System.out.println("Inject Bean Successful!");
        return "Inject Bean Successful!";
    }
}

package com.mancheng.techproof;

import abc.def.ghij.TestService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DynamicInject {

    @Autowired
    private ApplicationContext applicationContext;

//    @Resource(name = "testService222")
//    private TestService testservice;

    @Resource(name = "testService")
    private TestService testservice;

    @Autowired
    private TestService2 testService2;

    private int count = 0;

    private String beanName;

    public void injectBean() {
        //获取context.
        ++count;
        beanName = "testService" + count;

        //ApplicationContext ctx =  (ApplicationContext) SpringApplication.run(TechproofApplication.class, args);
        System.out.println(applicationContext.getClass());
        //获取BeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();
        //创建bean信息.
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(TestService.class);
        beanDefinitionBuilder.addPropertyValue("name","mancheng");
        //动态注册bean.
        defaultListableBeanFactory.registerBeanDefinition(beanName, beanDefinitionBuilder.getBeanDefinition());
        //获取动态注册的bean.
        TestService testService =applicationContext.getBean(beanName, TestService.class);
        testService.print();
    }


}

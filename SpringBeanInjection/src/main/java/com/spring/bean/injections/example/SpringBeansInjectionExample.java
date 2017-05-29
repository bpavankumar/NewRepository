package com.spring.bean.injections.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.injections.services.ConstructorBeanInjectionService;
import com.spring.bean.injections.services.MixedBeanInjectionService;
import com.spring.bean.injections.services.SetterBeanInjectionService;

public class SpringBeansInjectionExample {

    public static void main(String[] arguments) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        SetterBeanInjectionService setterService = (SetterBeanInjectionService) applicationContext.getBean("SetterBasedInjection");
        setterService.getArticleRecord();

        ConstructorBeanInjectionService constructorService = (ConstructorBeanInjectionService) applicationContext.getBean("ConstructorBasedInjection");
        constructorService.getArticleRecord();

        MixedBeanInjectionService mixedService = (MixedBeanInjectionService) applicationContext.getBean("MixedBasedInjection");
        mixedService.getArticleRecord();

        applicationContext.close();
    }
}
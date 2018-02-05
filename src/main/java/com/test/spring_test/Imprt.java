package com.test.spring_test;

import com.test.spring_test.someBeans.BeanWithName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Imprt {

    @Autowired
    private ImportantBean importantBean;

    @Bean
    BeanWithName beanWithName(){
        return new BeanWithName(importantBean.getName());
    }


}

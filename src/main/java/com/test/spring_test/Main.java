package com.test.spring_test;

import com.test.spring_test.someBeans.BeanWithName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Impl.class);
        BeanWithName bean = context.getBean(BeanWithName.class);
        System.out.println(bean.getName());
    }
}

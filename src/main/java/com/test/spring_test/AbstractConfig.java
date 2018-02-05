package com.test.spring_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public abstract class AbstractConfig {

    @Bean
    public ImportantBean importantBean(){
        return new ImportantBean("SampleName");
    }

}

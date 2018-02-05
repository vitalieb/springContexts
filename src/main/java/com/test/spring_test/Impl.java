package com.test.spring_test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Imprt.class)
public class Impl extends AbstractConfig {
}

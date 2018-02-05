package com.test.spring_test.someBeans;

public class BeanWithName {

    public BeanWithName() {
    }

    public BeanWithName(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

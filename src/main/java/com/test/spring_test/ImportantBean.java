package com.test.spring_test;

public class ImportantBean {

    public ImportantBean() {
    }

    public ImportantBean(String name) {
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

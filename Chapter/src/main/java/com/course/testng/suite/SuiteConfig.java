package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before Suite运行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after Suite运行了");
    }
}

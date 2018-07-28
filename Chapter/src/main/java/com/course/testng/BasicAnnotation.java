package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {


    @Test
    public void testCase(){
        System.out.println("Test这是测试用例1");

    }

    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod测试方法之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod测试方法之后运行");
    }

    @BeforeClass
    public  void beforeClass(){
        System.out.println("BeforeClass类运行之前运行的方法");
    }

    @AfterClass
    public  void afterClass(){
        System.out.println("AfterClass类运行之后运行的方法");
    }

    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public  void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}

package com.course.testng;

import org.testng.annotations.Test;

/**
 * 忽略测试
 */
public class IgnoreTest {

    @Test
    public void Ignore1(){
        System.out.println("Ignore1 执行了！");
    }


    @Test(enabled = false)
    public void Ignore2(){
        System.out.println("Ignore2 执行了！");
    }
}

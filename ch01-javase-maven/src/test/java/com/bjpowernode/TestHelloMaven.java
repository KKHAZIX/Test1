package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {

    @Test
    public void testAdd(){

        System.out.println("成功");
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(10, 20);

        //判断结果是否正确
        Assert.assertEquals(30,res);

    }
}

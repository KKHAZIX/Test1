package com.bjpowernode;

public class HelloMaven {
    public static void main(String[] args) {
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(10, 20);
        System.out.println(res);
    }

    public int add(int n1, int n2){
        return n1 + n2;
    }
}

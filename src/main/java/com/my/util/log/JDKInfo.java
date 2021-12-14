package com.my.util.log;

import java.security.SignedObject;

public class JDKInfo {
    public static void main(String[] args) {
        long l = Runtime.getRuntime().totalMemory();//java 虚拟机的内存总量
        long l1 = Runtime.getRuntime().maxMemory();//java 虚拟机试图使用的最大内存量
        Runtime.getRuntime().freeMemory();
        System.out.println("maxTotalMemory"+l/(double)1024/1024);
        System.out.println("JVM maxTotalMemory"+l1/(double)1024/1024);
    }


}

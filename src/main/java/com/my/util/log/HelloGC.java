package com.my.util.log;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class HelloGC {
    public static void main(String[] args) throws Exception {
        System.out.println("==================GC");
        Thread.sleep(Integer.MAX_VALUE);
//        System.out.println(System.getProperties());

    }
}

package com.my.util.log;

import java.lang.ref.SoftReference;

public class SoftReferenceDemo {

    public static void softRef_Memory_Enough(){
        Object o1 = new Object();
        SoftReference softReference = new SoftReference(o1);
        System.out.println(o1);
        System.out.println(softReference.get());

        o1 = null;
        System.gc();

        System.out.println(o1);
        System.out.println(softReference.get());

    }

    public static void softRef_Memory_NotEnough(){
        Object o1 = new Object();
        SoftReference softReference = new SoftReference(o1);
        System.out.println(o1);
        System.out.println(softReference.get());

        o1 = null;

        try {
            Byte[] bytes = new Byte[60 * 1024 * 1024];
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(o1);
            System.out.println(softReference.get());
        }




    }
    public static void main(String[] args) {
        softRef_Memory_NotEnough();
    }

}

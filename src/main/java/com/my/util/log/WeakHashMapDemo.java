package com.my.util.log;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        myHashMap();
    }

    public static void myHashMap() {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        Integer key = new Integer(1);
        String value = "1";
        hashMap.put(key,value);
        System.out.println(hashMap);

        key = null;
        System.out.println(hashMap);
        System.gc();
        System.out.println(hashMap);
        System.out.println("=============================");

        WeakHashMap<Integer,String> weakHashMap = new WeakHashMap<Integer, String>();
        Integer key1 = new Integer(1);
        String value1 = "1";
        weakHashMap.put(key1,value1);
        System.out.println(weakHashMap);

        key1 = null;
        System.out.println(weakHashMap);
        System.gc();
        System.out.println(weakHashMap);
        System.out.println("=============================");
    }
}

package com.my.util.log;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class WeakReferenceDemo {
    public static void main(String[] args) {
        Object o1 = new Object();
        WeakReference weakReference = new WeakReference(o1);
        System.out.println(o1);
        System.out.println(weakReference.get());

        o1 = null;
        System.gc();
        System.out.println("==================");
        System.out.println(o1);
        System.out.println(weakReference.get());

        WeakHashMap weakHashMap = new WeakHashMap();

    }

}

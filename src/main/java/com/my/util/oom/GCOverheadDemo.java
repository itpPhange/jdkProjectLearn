package com.my.util.oom;

import sun.java2d.pipe.SpanIterator;

import java.util.LinkedList;
import java.util.List;

/**
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 *
 * GC回收时间过长会抛出 GC overhead limit exceeded ,过长的定义是，超过98%的时间来做GC并且回收了不到2%的堆内存，
 * 连续多次GC都只回收了不到2%的极端情况下才会抛出。加入不抛出  GC overhead limit exceeded 错误会发生什么情况？
 * 那就是GC清理的这么点内存很快再次填满，迫使GC再次执行，这样就形成恶性循环，
 * CPU使用率一直都是100%，而GC却没有任何成果。
 */
public class GCOverheadDemo {
    public static void main(String[] args) throws Throwable {
        int i = 0;
        List<String> list = new LinkedList();
        try {
            while (true){
                list.add(String.valueOf(i++).intern());
            }
        }catch (Throwable e){
            System.out.println("---------------"+i);
            e.printStackTrace();
            throw e;
        }

    }


}

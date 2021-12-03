package main.java.com.my.util.pool;


import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class HoldLockThread implements Runnable{
private String LockA;
private String LockB;

    public HoldLockThread(String lockA,String lockB){
        this.LockA=lockA;
        this.LockB=lockB;
    }



    @Override
    public void run() {
        synchronized (LockA){
            System.out.println(Thread.currentThread().getName()+"自己持有"+LockA+"尝试获取"+LockB);
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (Exception e){
                e.printStackTrace();
            }
            synchronized (LockB){
                System.out.println(Thread.currentThread().getName()+"自己持有"+LockB+"尝试获取"+LockA);
            }

        }
    }
}



public class TreadPool {

    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new HoldLockThread(lockA,lockB),"ThreadAAAAA").start();
        new Thread(new HoldLockThread(lockB,lockA),"ThreadBBBBB").start();

    }



}

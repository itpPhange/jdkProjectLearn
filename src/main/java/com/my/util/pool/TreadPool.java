package main.java.com.my.util.pool;


import java.util.concurrent.*;

class HoldLockThread implements Callable {
private final String LockA;
private final String LockB;

    public HoldLockThread(String lockA,String lockB){
        this.LockA=lockA;
        this.LockB=lockB;
    }


    @Override
    public Object call() throws Exception {
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
        return null;
    }
}



public class TreadPool {



    public static void main(String[] args) throws Exception{
        ThreadPoolExecutor executors = new ThreadPoolExecutor(
                2,
                5,
                10,
                TimeUnit.NANOSECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        String lockA = "lockA";
        String lockB = "lockB";

        Future<Object> submit = executors.submit(new HoldLockThread(lockA, lockB));
        Future<Object> submit1 = executors.submit(new HoldLockThread(lockB, lockA));


    }



}

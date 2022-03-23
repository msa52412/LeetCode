package new1;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class mutilThread {
    private static Lock lock=new ReentrantLock();
    private static  int state=0;
    static class first extends Thread{
        @Override
        public void run(){
            while (true){
                lock.lock();
                if (state%4==0){
                    System.out.println("1");
                    state++;
                }
                lock.unlock();
            }
        }
    }
    static class second extends Thread{
        @Override
        public void run(){
            while (true){
                lock.lock();
                if (state%4==1){
                    System.out.println("2");
                    state++;
                }
                lock.unlock();
            }
        }
    }
    static class third extends Thread{
        @Override
        public void run(){
            while (true){
                lock.lock();
                if (state%4==2){
                    System.out.println("3");
                    state++;
                }
                lock.unlock();
            }
        }
    }
    static class four extends Thread{
        @Override
        public void run(){
            while (true){
                lock.lock();
                if (state%4==3){
                    System.out.println("4");
                    state++;
                }
                lock.unlock();
            }
        }
    }
    static Integer a=0;
    static Integer b=0;
    static Integer c=0;
    static Integer d=0;
    static volatile int max=0;
    static CountDownLatch countDownLatch=new CountDownLatch(1);
    public static void main(String[] args) {
        /*first f=new first();
        second s=new second();
        third t=new third();
        four fo=new four();
        f.start();
        s.start();
        t.start();
        fo.start();*/
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (max<100){
                    a+=new Random().nextInt(9);
                    max=Math.max(max,a);
                    if (a>=100) {
                        countDownLatch.countDown();
                    }
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                while (max<100){
                    b+=new Random().nextInt(9);
                    max=Math.max(max,b);
                    if (b>=100) countDownLatch.countDown();
                }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                while (max<100){
                    c+=new Random().nextInt(9);
                    max=Math.max(max,c);
                    if (c>=100) countDownLatch.countDown();
                }
            }
        });
        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                while (max>100){
                    d+=new Random().nextInt(9);
                    max=Math.max(max,d);
                    if (d>=100) countDownLatch.countDown();
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            countDownLatch.await();
            System.out.println(a+" "+b+" "+c+" "+d);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


    }

}

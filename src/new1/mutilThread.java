package new1;

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

    public static void main(String[] args) {
        first f=new first();
        second s=new second();
        third t=new third();
        four fo=new four();
        f.start();
        s.start();
        t.start();
        fo.start();
    }
}

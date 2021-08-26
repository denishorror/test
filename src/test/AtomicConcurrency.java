package test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicConcurrency {

    static volatile AtomicInteger fibonacсhiPrevious = new AtomicInteger(3);
    static volatile AtomicInteger fibonacсhiLast = new AtomicInteger(5);


    public static void main(String[] args) {

//        next();
//        remove();
//        hasNext();
//        System.out.println(hasNext());

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    next();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    next();
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        remove();
        hasNext();
//        System.out.println(hasNext());
    }

    public static void next() {
        fibonacсhiPrevious.getAndSet(fibonacсhiLast.getAndAdd(fibonacсhiPrevious.get()));
//        System.out.println(fibonachiLast);
//        System.out.println(fibonachiPrevious);
    }

    public static boolean hasNext() {
        return fibonacсhiLast.compareAndSet(0, 0);
    }

    public static void remove() {
        fibonacсhiLast.getAndSet(0);
//        System.out.println(fibonachiLast.get());
    }

}

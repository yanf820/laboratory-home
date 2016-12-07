package personal.leaf;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yf on 2016/12/5.
 */
public class WhatUnsafe {

    private static volatile int value;

    public WhatUnsafe(boolean initialValue) {
        value = initialValue ? 1 : 0;

    }


    private AtomicInteger atomicInteger=new AtomicInteger(1);
    public  void test() throws InterruptedException {

        Runnable r=new Runnable() {
            public void run() {
                atomicInteger.getAndIncrement();

            }
        };

        for (int i =1 ;i<10000;i++){

            new Thread(r).start();

        }
          Thread.sleep(1000);

        System.out.println(atomicInteger);
    }

    public static void main(String[] args) throws InterruptedException {

//WhatUnsafe whatUnsafe=new WhatUnsafe(true);
//whatUnsafe.test();
    }
}

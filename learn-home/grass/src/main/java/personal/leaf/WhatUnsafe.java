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
    private  AtomicInteger atomicInteger=new AtomicInteger(1);
    public  void test() {


        for (int i =1 ;i<10000;i++){

            new Thread(new Runnable() {
                public void run() {
                    atomicInteger.incrementAndGet();
                }
            }).start();
        }
        System.out.println(atomicInteger);
    }

    public static void main(String[] args) {

WhatUnsafe whatUnsafe=new WhatUnsafe(true);
whatUnsafe.test();
    }
}

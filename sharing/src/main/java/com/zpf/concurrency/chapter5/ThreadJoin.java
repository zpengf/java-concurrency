package com.zpf.concurrency.chapter5;

import java.util.stream.IntStream;

/**
 * @ClassName: ThreadJoin
 * @Author: pengfeizhang
 * @Description: join用法 用法
 * @Date: 2021/10/18 下午8:15
 * @Version: 1.0
 */
public class ThreadJoin {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(()->{
            IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()));

        });
        t1.start();
        //t1 执行完 才会执t2
        t1.join();

        IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName() + "main"));

    }


}

package com.zpf.concurrency.chapter3;

/**
 * @ClassName: ThreadContruct
 * @Author: pengfeizhang
 * @Description:
 * @Date: 2021/9/25 下午5:08
 * @Version: 1.0
 */
public class ThreadContruct {

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();

        System.out.println(t1.getId()+"***"+t1.getName());

        System.out. println(t2.getId()+"***"+t2.getName());

    }


}

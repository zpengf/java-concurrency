package com.zpf.concurrency.chapter4;

/**
 * @ClassName: DaemonThread1
 * @Author: pengfeizhang
 * @Description: 守护线程
 * @Date: 2021/10/13 下午8:23
 * @Version: 1.0
 */
public class DaemonThread1 {

    public static void main(String[] args){

        Thread t = new Thread(){

            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+"running");

                    Thread.sleep(1000);

                    System.out.println(Thread.currentThread().getName()+"done");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };
        
        t.setDaemon(true);//守护线程 父/主函数完事  他也完事
        
        t.start();
        
        System.out.println(Thread.currentThread().getName()+"!!");

    }
}

package com.zpf.concurrency.chapter6;

/**
 * @ClassName: ThreadInterrupt
 * @Author: pengfeizhang
 * @Description: 线程中断
 * 
 * 
 * 
 * @Date: 2021/10/18 下午9:38
 * @Version: 1.0
 */
public class ThreadInterrupt {

    public static void main(String[] args) throws Exception{
        
        Thread t = new Thread(){

            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("----yy");

                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
        Thread.sleep(100);
        System.out.println(t.isInterrupted());
        t.interrupt();
        System.out.println(t.isInterrupted());

    }

    //还有个静态类方法
    
}

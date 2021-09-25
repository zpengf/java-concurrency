package com.zpf.concurrency.chapter2;


/**
 * @ClassName: TicketWidowRunnable
 * @Author: pengfeizhang
 * @Description: Ruannable实现
 * @Date: 2021/9/25 下午4:01
 * @Version: 1.0
 */
public class TicketWidowRunnable implements Runnable {

    private static int index = 1;

    private static final int MAX = 50;


    public void run() {

        while (index <= MAX){
            System.out.println(Thread.currentThread()+"柜台取走了"+(index++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

package com.zpf.concurrency.chapter2;


/**
 * @ClassName: Bank
 * @Author: pengfeizhang
 * @Description: 银行叫号多线程实现
 * @Date: 2021/9/25 下午3:48
 * @Version: 1.0
 */
public class Bank {

    public static void main(String[] args) {
//        ticketWindow ticketWindow1 = new ticketWindow("1 号");
//        ticketWindow ticketWindow2 = new ticketWindow("2 号");
//        ticketWindow ticketWindow3 = new ticketWindow("3 号");
//
//        ticketWindow1.start();
//        ticketWindow2.start();
//        ticketWindow3.start();
        //Thread 逻辑 和使用在一起

        //使用 Runnable 就是把逻辑抽取了出来  怎么操作控制线程另写
        TicketWidowRunnable ticketWidowRunnable = new TicketWidowRunnable();
        Thread thread1 = new Thread(ticketWidowRunnable,"yihao");
        Thread thread2 = new Thread(ticketWidowRunnable,"erhao");
        Thread thread3 = new Thread(ticketWidowRunnable,"sanhao");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

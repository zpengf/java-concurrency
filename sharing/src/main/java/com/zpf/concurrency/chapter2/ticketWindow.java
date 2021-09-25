package com.zpf.concurrency.chapter2;

/**
 * @ClassName: ticketWindow
 * @Author: pengfeizhang
 * @Description: bank 银行叫号器
 * @Date: 2021/9/25 下午3:44
 * @Version: 1.0
 */
public class ticketWindow extends Thread {

    private final String name;

    private static final int max = 50;
    
    private static int index = 1;

    public ticketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
       while (index < max){
           System.out.println("当前叫号器："+name+"叫的号为"+(index++));
       }
    }
}

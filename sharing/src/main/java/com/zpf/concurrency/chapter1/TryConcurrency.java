package com.zpf.concurrency.chapter1;

/**
 * @ClassName: TryConcurrency
 * @Author: pengfeizhang
 * @Description: 并发并行做事情
 * @Date: 2021/9/25 下午1:33
 * @Version: 1.0
 */
public class TryConcurrency {

    // create a main thread
    public static void main(String[] args) {
        // this APP just one by one
//        readDataFromDataBase();
//        writeDataToFile();

        new Thread("read"){
            @Override
            public void run() {
                readDataFromDataBase();
            }
        }.start();

        new Thread("write"){
            @Override
            public void run() {
                writeDataToFile();
            }
        }.start();
    }


    private static void readDataFromDataBase(){
        try {
            System.out.println("begin read data from Db");
            Thread.sleep(1000*10l);
            System.out.println("read data from db successfully");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("handle data success");
    }

    private static void writeDataToFile(){
        try {
            System.out.println("begin write data to file");
            Thread.sleep(1000*10l);
            System.out.println("write data from db successfully");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("handle data success");
    }

}

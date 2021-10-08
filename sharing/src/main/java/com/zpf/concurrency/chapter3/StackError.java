package com.zpf.concurrency.chapter3;

/**
 * @ClassName: StackError
 * @Author: pengfeizhang
 * @Description: 栈的测试
 * @Date: 2021/10/8 下午9:10
 * @Version: 1.0
 */
public class StackError {

    private static int count = 0;

     
    public static void main(String[] args) {


        try {
            add(0);
        }catch (Error e){
            e.printStackTrace();
            System.out.println(count);

        }
        


    }
    
    static void add(int i){
        count++;
        add(i+1);
    }
    
}

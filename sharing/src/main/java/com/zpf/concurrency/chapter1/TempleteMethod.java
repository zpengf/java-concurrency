package com.zpf.concurrency.chapter1;

/**
 * @ClassName: TempleteMethod
 * @Author: pengfeizhang
 * @Description: mo fang thread shi xian
 * @Date: 2021/9/25 下午2:45
 * @Version: 1.0
 */
public abstract class TempleteMethod {

    public final void  print(String msg){
        System.out.println("**************");
        wrapPrint(msg);
        System.out.println("**************");

    }

    protected void wrapPrint(String msg){
    }

    public static void main(String[] args) {
        TempleteMethod t1 = new TempleteMethod() {
            @Override
            protected void wrapPrint(String msg) {
                System.out.println(msg+"!!!!!!");
            }
        };
        t1.print("gan");

        //就是模仿 thread的start方法 start里面会启动run方法
        //类似 这个 print里面会启动 wrapPrint方法 但是这个方法是可以被重写的 写成自己想启动

        //用的就是模版方法的技巧
    }

}

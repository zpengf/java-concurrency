package com.zpf.concurrency.chapter2;

/**
 * @ClassName: CalaculatorStrategy1
 * @Author: pengfeizhang
 * @Description:
 * @Date: 2021/9/25 下午4:49
 * @Version: 1.0
 */
public class CalaculatorStrategy1 implements StrategyInterface {


    private final double tax_sa = 0.2;


    private final double tax_bo = 0.2;

    public double calaculator(double salary, double bonus) {
        return salary*tax_sa + bonus*tax_bo;
    }
}

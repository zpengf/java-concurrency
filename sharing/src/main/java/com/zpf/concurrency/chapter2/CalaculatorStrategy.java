package com.zpf.concurrency.chapter2;

/**
 * @ClassName: CalaculatorStrategy
 * @Author: pengfeizhang
 * @Description: 策略模式计算
 * @Date: 2021/9/25 下午4:31
 * @Version: 1.0
 */
public class CalaculatorStrategy implements StrategyInterface{

    private final double tax_sa = 0.1;


    private final double tax_bo = 0.1;


    public double calaculator(double salary, double bonus) {
        return salary*tax_sa + bonus*tax_bo;
    }
}

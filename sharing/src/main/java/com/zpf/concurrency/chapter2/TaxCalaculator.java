package com.zpf.concurrency.chapter2;

/**
 * @ClassName: TaxCalaculator
 * @Author: pengfeizhang
 * @Description: 策略模式
 * @Date: 2021/9/25 下午4:28
 * @Version: 1.0
 */
public class TaxCalaculator {

    private double salary;

    private double bonus;

    private StrategyInterface strategyInterface;

    public TaxCalaculator(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setCalaculatorStrategy(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public double calTax(){
        return strategyInterface.calaculator(salary,bonus);
    }

}

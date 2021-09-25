package com.zpf.concurrency.chapter2;

/**
 * @ClassName: TaxCal
 * @Author: pengfeizhang
 * @Description: 计算税率
 * @Date: 2021/9/25 下午4:39
 * @Version: 1.0
 */
public class TaxCal {

    public static void main(String[] args) {

        //这就是策略模式
        TaxCalaculator taxCalaculator = new TaxCalaculator(1000d,1000d);
        
        StrategyInterface calaculatorStrategy = new CalaculatorStrategy1();
        
        taxCalaculator.setCalaculatorStrategy(calaculatorStrategy);
        
        System.out.println(taxCalaculator.calTax());

    }
}

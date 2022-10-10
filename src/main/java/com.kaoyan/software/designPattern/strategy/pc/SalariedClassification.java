package com.kaoyan.software.designPattern.strategy.pc;

/**
 * @author Arthur
 * @version 1.0
 * @description: TODO
 * @date 2022/10/8 22:33
 */
public class SalariedClassification implements PaymentClassification {
    double salary = 0;

    public SalariedClassification(double salary){
        this.salary = salary;
    }

    @Override
    public double calculationPayment() {
        return salary;
    }
}

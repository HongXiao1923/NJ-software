package com.kaoyan.software.designPattern.strategy.pc;

/**
 * @author Arthur
 * @version 1.0
 * @description: TODO
 * @date 2022/10/8 22:20
 */
public class CommissionedClassification implements PaymentClassification {
    double rate = 0;
    double overWork = 0;

    public CommissionedClassification(double rate, double overWork){
        this.rate = rate;
        this.overWork = overWork;
    }

    @Override
    public double calculationPayment() {
        double sum = 0;
        sum = rate + overWork;
        return sum;
    }
}

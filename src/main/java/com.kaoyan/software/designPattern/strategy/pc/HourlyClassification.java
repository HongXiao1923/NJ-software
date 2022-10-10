package com.kaoyan.software.designPattern.strategy.pc;

/**
 * @author Arthur
 * @version 1.0
 * @description: TODO
 * @date 2022/10/8 22:16
 */
public class HourlyClassification implements PaymentClassification {
    int hourlyRate;
    int hours;

    public HourlyClassification(int hourlyRate, int hours){
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculationPayment() {
        int sum = 0;
        sum = hourlyRate * hours;
        return sum;
    }
}

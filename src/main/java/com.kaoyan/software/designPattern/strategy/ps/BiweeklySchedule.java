package com.kaoyan.software.designPattern.strategy.ps;

/**
 * @author Arthur
 * @version 1.0
 * @description: TODO
 * @date 2022/10/8 22:45
 */
public class BiweeklySchedule implements PaymentSchedule {
    @Override
    public boolean isPayDay() {
        return false;
    }
}

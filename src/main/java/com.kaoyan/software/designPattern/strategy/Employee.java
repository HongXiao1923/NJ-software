package com.kaoyan.software.designPattern.strategy;

import com.kaoyan.software.designPattern.strategy.pc.PaymentClassification;
import com.kaoyan.software.designPattern.strategy.ps.PaymentSchedule;

/**
 * @author Arthur
 * @version 1.0
 * @description: TODO
 * @date 2022/10/8 22:12
 */
public class Employee {
    String name;
    int id;
    PaymentClassification pc;
    PaymentSchedule ps;

    public Employee(String s, int id){
        this.name = s;
        this.id = id;
    }
    //支付薪资
    public void getPayment(){
        double payment = 0;
        payment = pc.calculationPayment();
        System.out.println(name + " get " + payment + " dollars!");
    }
    //支付频率
    public void isPayDay(){
        boolean isPay = false;
        isPay = ps.isPayDay();
        if(isPay){
            System.out.println("A payDay for " + name + "!");
        }
    }
    //设置策略
    public void setPaymentClassification(PaymentClassification paymentClassification){
        this.pc = paymentClassification;
    }
    public void setPaymentSchedule(PaymentSchedule paymentSchedule){
        this.ps = paymentSchedule;
    }
}

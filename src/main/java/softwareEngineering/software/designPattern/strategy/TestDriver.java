package softwareEngineering.software.designPattern.strategy;

import softwareEngineering.software.designPattern.strategy.pc.CommissionedClassification;
import softwareEngineering.software.designPattern.strategy.pc.HourlyClassification;
import softwareEngineering.software.designPattern.strategy.pc.SalariedClassification;
import softwareEngineering.software.designPattern.strategy.ps.WeeklySchedule;

/**
 * @author Arthur
 * @version 1.0
 * @description: TODO
 * @date 2022/10/8 22:11
 */
public class TestDriver {
    public static void main(String[] args) {
        //创建Employee对象
        Employee tom = new Employee("tom", 0);
        Employee jack = new Employee("jack", 0);
        Employee kevin = new Employee("kevin", 0);

        //创建不同的具体策略
        HourlyClassification hc = new HourlyClassification(10, 40);
        CommissionedClassification cc = new CommissionedClassification(0.01, 1000000);
        SalariedClassification sc = new SalariedClassification(3000);
        WeeklySchedule ws = new WeeklySchedule();
    }
}

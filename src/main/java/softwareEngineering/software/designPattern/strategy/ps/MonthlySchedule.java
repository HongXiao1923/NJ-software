package softwareEngineering.software.designPattern.strategy.ps;

/**
 * @author Arthur
 * @version 1.0
 * @description: TODO
 * @date 2022/10/8 22:43
 */
public class MonthlySchedule implements PaymentSchedule {
    @Override
    public boolean isPayDay() {
        return false;
    }
}

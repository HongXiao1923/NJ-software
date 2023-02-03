package headFirst.designPattern.cDecorator;

/**
 * @author Einstein
 * @version 1.0
 * @description 调料（Beverage的一种）——摩卡
 * @date 2022/11/10 15:39
 * @see
 */
public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";       //使用了委托
    }

    @Override
    public double cost() {
        return beverage.cost() + .22;
    }
}

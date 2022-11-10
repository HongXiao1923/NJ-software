package headFirst.designPattern.IIDecorator;

/**
 * @author Einstein
 * @version 1.0
 * @description 调料（Beverage的一种）——奶泡
 * @date 2022/11/10 15:39
 * @see
 */
public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip";       //使用了委托
    }

    @Override
    public double cost() {
        return beverage.cost() + .87;
    }
}

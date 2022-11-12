package headFirst.designPattern.IIIDecorator;

/**
 * @author Einstein
 * @version 1.0
 * @description 调料（Beverage的一种）——豆奶
 * @date 2022/11/10 15:39
 * @see
 */
public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";       //使用了委托
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.31;
    }
}

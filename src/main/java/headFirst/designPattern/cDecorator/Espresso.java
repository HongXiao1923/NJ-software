package headFirst.designPattern.cDecorator;

/**
 * @author Einstein
 * @version 1.0
 * @description 饮料——浓咖啡
 * @date 2022/11/10 15:35
 * @see
 */
public class Espresso extends Beverage{
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

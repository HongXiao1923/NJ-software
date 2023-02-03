package headFirst.designPattern.cDecorator;

/**
 * @author Einstein
 * @version 1.0
 * @description 饮料——混合型
 * @date 2022/11/10 15:35
 * @see
 */
public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}

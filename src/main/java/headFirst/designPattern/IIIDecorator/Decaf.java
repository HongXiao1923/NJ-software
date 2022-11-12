package headFirst.designPattern.IIIDecorator;

/**
 * @author Einstein
 * @version 1.0
 * @description 饮料——低咖
 * @date 2022/11/10 15:35
 * @see
 */
public class Decaf extends Beverage{
    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return .90;
    }
}

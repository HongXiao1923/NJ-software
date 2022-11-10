package headFirst.designPattern.IIDecorator;

/**
 * @author Einstein
 * @version 1.0
 * @description 饮料装饰器——饮料父类
 * @date 2022/11/10 15:32
 * @see
 */
public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;      //组合，以实现包裹
    public abstract double cost();
}

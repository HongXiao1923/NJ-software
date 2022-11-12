package headFirst.designPattern.IIIDecorator;

/**
 * @author Einstein
 * @version 1.0
 * @description 抽象饮料根类
 * @date 2022/11/10 15:30
 * @see
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

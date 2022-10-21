package softwareEngineering.software.designPattern.build.simpleFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description 抽象产品：披萨
 * @date 2022/10/18 20:20
 * @see
 */
public abstract class Pizza {

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
package softwareEngineering.software.designPattern.build.factoryMethod;

/**
 * @author Einstein
 * @version 1.0
 * @description 抽象工厂：披萨总店
 * @date 2022/10/19 10:53
 * @see
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /*
     * 创建pizza的方法交给子类去实现
     */
    abstract Pizza createPizza(String type);
}

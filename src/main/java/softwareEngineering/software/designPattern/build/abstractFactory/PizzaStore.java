package softwareEngineering.software.designPattern.build.abstractFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/19 19:39
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
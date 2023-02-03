package headFirst.designPattern.dFactory.iiiAbstractFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/18 14:59
 * @see
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String item){
        Pizza pizza = null;

        pizza = createPizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    public abstract Pizza createPizza(String item);

}

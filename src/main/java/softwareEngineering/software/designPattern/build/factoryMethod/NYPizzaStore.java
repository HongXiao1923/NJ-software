package softwareEngineering.software.designPattern.build.factoryMethod;

import softwareEngineering.software.designPattern.build.factoryMethod.NY.NYStyleCheesePizza;
import softwareEngineering.software.designPattern.build.factoryMethod.NY.NYStyleClamPizza;
import softwareEngineering.software.designPattern.build.factoryMethod.NY.NYStylePepperoniPizza;
import softwareEngineering.software.designPattern.build.factoryMethod.NY.NYStyleVeggiePizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体工厂：纽约披萨分店
 * @date 2022/10/19 10:54
 * @see
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        if ("cheese".equals(item)) {
            pizza = new NYStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            pizza = new NYStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            pizza = new NYStyleClamPizza();
        } else if ("pepperoni".equals(item)) {
            pizza = new NYStylePepperoniPizza();
        }

        return pizza;
    }
}
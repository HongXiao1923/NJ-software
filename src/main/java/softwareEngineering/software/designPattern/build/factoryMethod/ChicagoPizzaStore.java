package softwareEngineering.software.designPattern.build.factoryMethod;

import softwareEngineering.software.designPattern.build.factoryMethod.chicago.ChicagoStyleCheesePizza;
import softwareEngineering.software.designPattern.build.factoryMethod.chicago.ChicagoStyleClamPizza;
import softwareEngineering.software.designPattern.build.factoryMethod.chicago.ChicagoStylePepperoniPizza;
import softwareEngineering.software.designPattern.build.factoryMethod.chicago.ChicagoStyleVeggiePizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体工厂：芝加哥披萨分店
 * @date 2022/10/19 10:56
 * @see
 */
public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        }
        else if("clam".equals(type)){
            pizza = new ChicagoStyleClamPizza();
        }
        else if("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        else if("veggie".equals(type)){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }

}

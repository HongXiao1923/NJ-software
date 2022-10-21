package softwareEngineering.software.designPattern.build.simpleFactory;

import softwareEngineering.software.designPattern.build.simpleFactory.style.CheesePizza;
import softwareEngineering.software.designPattern.build.simpleFactory.style.ClamPizza;
import softwareEngineering.software.designPattern.build.simpleFactory.style.PepperoniPizza;
import softwareEngineering.software.designPattern.build.simpleFactory.style.VeggiePizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 工厂：生产各种披萨
 * @date 2022/10/18 20:22
 * @see
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza();
        }
        else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
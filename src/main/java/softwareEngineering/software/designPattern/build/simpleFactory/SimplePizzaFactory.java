package softwareEngineering.software.designPattern.build.simpleFactory;

/**
 * @author Einstein
 * @version 1.0
 * @description 专门用于创建披萨的工厂类
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
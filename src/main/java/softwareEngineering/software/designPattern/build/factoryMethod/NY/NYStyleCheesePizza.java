package softwareEngineering.software.designPattern.build.factoryMethod.NY;

import softwareEngineering.software.designPattern.build.factoryMethod.Pizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体产品：纽约奶酪披萨
 * @date 2022/10/19 10:50
 * @see
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Crated Reggiano Cheese");
    }

}

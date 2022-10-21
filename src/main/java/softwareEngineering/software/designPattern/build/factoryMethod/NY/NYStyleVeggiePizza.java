package softwareEngineering.software.designPattern.build.factoryMethod.NY;

import softwareEngineering.software.designPattern.build.factoryMethod.Pizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体产品：纽约素食披萨
 * @date 2022/10/19 10:51
 * @see
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza(){
        name = "NY Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Veggie");
    }

    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}

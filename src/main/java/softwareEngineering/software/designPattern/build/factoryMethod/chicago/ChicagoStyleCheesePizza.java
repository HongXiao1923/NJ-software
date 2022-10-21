package softwareEngineering.software.designPattern.build.factoryMethod.chicago;

import softwareEngineering.software.designPattern.build.factoryMethod.Pizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体产品：芝加哥奶酪披萨
 * @date 2022/10/19 10:51
 * @see
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}

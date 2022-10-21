package softwareEngineering.software.designPattern.build.factoryMethod.chicago;

import softwareEngineering.software.designPattern.build.factoryMethod.Pizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体产品：芝加哥素食披萨
 * @date 2022/10/19 10:51
 * @see
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza(){
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Veggie");
    }

    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}

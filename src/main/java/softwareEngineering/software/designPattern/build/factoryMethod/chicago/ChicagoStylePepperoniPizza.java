package softwareEngineering.software.designPattern.build.factoryMethod.chicago;

import softwareEngineering.software.designPattern.build.factoryMethod.Pizza;

/**
 * @author Einstein
 * @version 1.0
 * @description 具体产品：芝加哥意大利腊肠披萨
 * @date 2022/10/19 10:51
 * @see
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Pepperoni");
    }

    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
